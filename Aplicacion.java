import java.io.BufferedReader;
import java.io.FileReader;

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

    public ArrayList<Vivienda> getVivienda() {
        return viviendas;
    }
	
	public Boolean añadirVivienda(Vivienda v){
		if(v == null || v.getEstado() != ACEPTADA){
			throw new IllegalArgumentException("Oferta incorrecto");
		}

		viviendas.add(v);
		System.out.println("Oferta añadido.");
		return true;
	}
	
    public void setVivienda(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
    
    public boolean cargarDatos(String fichero){
    	if(fichero == null){
    		throw new IllegalArgumentException("Fallo en la reserva\n");
			return false;
    	}
    	
    	ArrayList<Registrado> registrados;
    	String linea;
    	String campos[];
    	String datos[];
    	
    	File file = new File(fichero);
    	
    	Scanner sc = new Scanner(file);
    	linea = sc.nextLine();
    	campos = linea.split(";");
    	
    	while((linea = sc.nextLine()) != null){
    		datos = linea.split(";");
    		Registrado r = new Registrado(datos[1], datos[2], datos[3], datos[4], datos[0]);
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
    	return false;
    }
    
    
    public void logout(Registrado registradoActual){
    	registradoActual = null;
    }
    
    public Boolean modificarTarjeta(Registrado r){
    	if(r.getNombre() == null || r.getTipoUsuario() == GERENTE) return false;
    	
    	String newNumT;
    	Scanner sc = new Scanner(System.in);
    	
    	Sistem.out.print("Inserte su número de tarjeta\n");
    	newNumT = sc.nextLine();
    	
    	while(newNumT.length() < 16){
			Sistem.out.print("Inserte su número de tarjeta\n");
    		newNumT = sc.nextLine();	
    	}
 
    	r.setNumTarjeta(newNumT);
    	
    	sc.close();
    	return true;
    	
    }
    
    public ArrayList<Oferta> Buscar(Filtros f, ArrayList<Oferta> ofertas){
    	ArrayList<Oferta> o = new ArrayList<Oferta>();
    	
    }
    
}