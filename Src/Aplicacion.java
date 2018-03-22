import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Aplicacion{
	/*
	 * Declaración de los atributos de las clases.
	 *También se inicializan las variables
	 */

	private ArrayList<Vivienda> viviendas;
	private ArrayList<Registrado> registrados;
	private Registrado registradoActual;
	private int nRegs;
	private int nVivs;

	public Aplicacion(){
		viviendas = new ArrayList<Vivienda>();
		registrados = new ArrayList<Registrado>();
		nRegs = 0;
		nVivs = 0;

	}
	
	public Boolean añadirVivienda(Vivienda v){
		if(v == null || v.getEstado() != EstadoOferta.ACEPTADA){
			throw new IllegalArgumentException("Oferta incorrecto");
		}

		viviendas.add(v);
		nVivs++;
		System.out.println("Oferta añadida.");
		return true;
	}

    
    public boolean cargarDatos(String fichero) throws FileNotFoundException {
    	if(fichero == null){
    		throw new IllegalArgumentException("Fallo en la reserva\n");
        }

    	TipoUsuario u = null;
    	String linea;
    	String campos[];
    	String datos[];
    	
    	File file = new File(fichero);
    	
    	Scanner sc = new Scanner(file);
    	linea = sc.nextLine();
    	campos = linea.split(";");
    	
    	while((linea = sc.nextLine()) != null){
    		datos = linea.split(";");
    		if(datos[0].equals("O")){
    		    u = TipoUsuario.ARRENDADOR;
            }
            if(datos[0].equals("D")){
                u = TipoUsuario.ARRENDATARIO;
            }
            if(datos[0].equals("OD")){
                u = TipoUsuario.BOTH;
            }

    		Registrado r = new Registrado(datos[1], datos[2], datos[3], datos[4], u);
    		registrados.add(r);
    		nRegs++;
    	}
    	
    	return true;
    	/*0 = ROL, 1 = NIF, 2 = FULL NAME, 3 = PASSWORD, 4 = CREDIT CARD*/
    }
    
    public boolean login(String dni, String contrasenia){
    	
    	for(int i = 0; i < nRegs; i++){
    		if(registrados.get(i).getDni().equals(dni) && registrados.get(i).getContrasenia().equals(contrasenia)){
    			registradoActual = registrados.get(i);
    			return true;
    		}
    	}
    	
    	throw new IllegalArgumentException("Usuario/Contraseña incorrecto/a\n");
    }
    
    
    public void logout(Registrado registradoActual){
    	registradoActual = null;
    }
    
    public boolean modificarTarjeta(Registrado r){
    	if(r.getNombre() == null || r.getTipoUsuario() == TipoUsuario.GERENTE) return false;
    	
    	String newNumT;
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Inserte su número de tarjeta\n");
    	newNumT = sc.nextLine();
    	
    	while(newNumT.length() < 16){
			System.out.print("Inserte su número de tarjeta\n");
    		newNumT = sc.nextLine();	
    	}
 
    	r.setNumTarjeta(newNumT);
    	
    	sc.close();
    	return true;
    	
    }
    
    public ArrayList<Oferta> Buscar(ArrayList<Oferta> ofertas){
    	ArrayList<Oferta> o = new ArrayList<Oferta>();
    	Filtro f = new Filtro();
    	Scanner sc = new Scanner(System.in);
    	String scannerF = "";
    	String scannerC = "";
    	int scannerI = -1;

    	if(registradoActual.getTipoUsuario() == TipoUsuario.NOREGISTRADO){
    	    while(!scannerF.equals("TipoVivienda") || !scannerF.equals("CP") || !scannerF.equals("FechaInicio")) {
                System.out.print("Usted tiene acceso a los siguientes filtros: \n\t-TipoVivienda(Vacacional/Residencial)\n\t-CP\n\t-FechaInicio\n");
                System.out.print("Introduzca el filtro a modificar: \n");
                scannerF = sc.nextLine();
                if (scannerF.equals("TipoVivienda")) {
                    while (!scannerC.equals("Vacacional") || !scannerC.equals("Residencial")) {
                        System.out.print("Introduzca tipo de vivienda: Vacacional/Residencial\n");
                        scannerC = sc.nextLine();

                        if (scannerC.equals("Vacacional")) {
                            for (int i = 0; i < nVivs; i++) {
                                for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                    if (viviendas.get(i).getOfertas().get(j).getTipoVivienda() == TipoVivienda.VACACIONAL && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                        o.add(viviendas.get(i).getOfertas().get(j));
                                    }
                                }
                            }
                        }

                        if (scannerC.equals("Residencial")) {
                            for (int i = 0; i < nVivs; i++) {
                                for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                    if (viviendas.get(i).getOfertas().get(j).getTipoVivienda() == TipoVivienda.RESIDENCIAL && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                        o.add(viviendas.get(i).getOfertas().get(j));
                                    }
                                }
                            }
                        }
                    }
                }

                if(scannerF.equals("CP")){
                    while(!isCPValido(scannerI)){
                        System.out.print("Introduzca el CP deseado: \n");
                        scannerI = sc.nextInt();
                        if(isCPValido(scannerI)){
                            for (int i = 0; i < nVivs; i++) {
                                for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                    if (viviendas.get(i).getCP() == scannerI && viviendas.get(i).getEstado() == EstadoOferta.ACEPTADA) {
                                        o.add(viviendas.get(i).getOfertas().get(j));
                                    }
                                }
                            }
                        }
                    }
                }

                /*PUTAS FECHAS BRROOO.  SKRRRR*/
                /*if(scannerF.equals("FechaInicio")){

                }*//*/*//*/*//*/*///**/*/*/*/*/*//***///***/*/*//*//*/*/*/*/*/*/***//*/*/*//*/*
            }
            /*COMO HACER QUE PUEDA FILTRAR POR MAS COSAS*/
            sc.close();
            return o;
        }

        System.out.print("Usted tiene acceso a los siguientes filtros: \n\t-TipoVivienda(Vacacional/Residencial)\n\t-CP\n\t-FechaInicio\n\t-Valoracion\n\t-EstadoReserva(Si/No)\n\t-EstadoAlquilado(Si/No)\n");
    	while(!scannerF.equals("TipoVivienda") || !scannerF.equals("CP") || !scannerF.equals("FechaInicio") || !scannerF.equals("Valoracion") || !scannerF.equals("EstadoReserva") || !scannerF.equals("EstadoAlquilado")){
            System.out.print("Usted tiene acceso a los siguientes filtros: \n\t-TipoVivienda(Vacacional/Residencial)\n\t-CP\n\t-FechaInicio\n\t-Valoracion\n\t-EstadoReserva(Si/No)\n\t-EstadoAlquilado(Si/No)\n");
            System.out.print("Introduzca el filtro a modificar: \n");
            scannerF = sc.nextLine();

            if (scannerF.equals("TipoVivienda")) {
                while (!scannerC.equals("Vacacional") || !scannerC.equals("Residencial")) {
                    System.out.print("Introduzca tipo de vivienda: Vacacional/Residencial\n");
                    scannerC = sc.nextLine();

                    if (scannerC.equals("Vacacional")) {
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getTipoVivienda() == TipoVivienda.VACACIONAL && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }

                    if (scannerC.equals("Residencial")) {
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getTipoVivienda() == TipoVivienda.RESIDENCIAL && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }
                }
            }

            if(scannerF.equals("CP")){
                while(!isCPValido(scannerI)){
                    System.out.print("Introduzca el CP deseado: \n");
                    scannerI = sc.nextInt();
                    if(isCPValido(scannerI)){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getCP() == scannerI && viviendas.get(i).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }
                }
            }

            /*PUTAS FECHAS BRROOO.  SKRRRR*/
                /*if(scannerF.equals("FechaInicio")){

                }*//*/*//*/*//*/*///**/*/*/*/*/*//***///***/*/*//*//*/*/*/*/*/*/***//*/*/*//*/*

            if(scannerF.equals("Valoracion")){
                while(!isValoracionValida(scannerI)){
                    System.out.print("Introduzca la valoración deseada: \n");
                    scannerI = sc.nextInt();
                    if(isValoracionValida(scannerI)){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getValoraciones().getValor() == scannerI && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }
                }
            }

            if(scannerF.equals("EstadoReservado")){
                while(!scannerC.equals("Si") || !scannerC.equals("No")){
                    System.out.print("Introduzca estado del filtro de reservado; Si/No");
                    scannerC = sc.nextLine();

                    if(scannerC.equals("Si")){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getReservada() == true && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }

                    if(scannerC.equals("No")){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getReservada() == false && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }
                }
            }

            if(scannerF.equals("EstadoAlquilado")){
                while(!scannerC.equals("Si") || !scannerC.equals("No")){
                    System.out.print("Introduzca estado del filtro de alquilado; Si/No");
                    scannerC = sc.nextLine();

                    if(scannerC.equals("Si")){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getAlquilada() == true && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }

                    if(scannerC.equals("No")){
                        for (int i = 0; i < nVivs; i++) {
                            for (int j = 0; j < viviendas.get(i).getNumO(); j++) {
                                if (viviendas.get(i).getOfertas().get(j).getAlquilada() == false && viviendas.get(i).getOfertas().get(j).getEstado() == EstadoOferta.ACEPTADA) {
                                    o.add(viviendas.get(i).getOfertas().get(j));
                                }
                            }
                        }
                    }
                }
            }
        }

    	sc.close();
    	return o;
    }

    public ArrayList<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }

    public ArrayList<Registrado> getRegistrados() {
        return registrados;
    }

    public void setRegistrados(ArrayList<Registrado> registrados) {
        this.registrados = registrados;
    }

    public Registrado getRegistradoActual() {
        return registradoActual;
    }

    public void setRegistradoActual(Registrado registradoActual) {
        this.registradoActual = registradoActual;
    }

    public int getnRegs() {
        return nRegs;
    }

    public void setnRegs(int nRegs) {
        this.nRegs = nRegs;
    }

    public int getnVivs() {
        return nVivs;
    }

    public void setnVivs(int nVivs) {
        this.nVivs = nVivs;
    }

    public boolean isCPValido(int CP){
        if(CP<53000 && CP > 999){
            return true;
        }
        return false;
    }

    public boolean isValoracionValida(int i){
	    if(i < 1 || i > 5) return false;
	    return true;
    }
}