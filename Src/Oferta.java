import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */


public class Oferta{

	//private static final Class<Valoracion[]>[] Valoracion = null;
	private String nombreOferta;
	private int numHabitaciones;
	private int precio;
	private int fianza;
	private String descripcion;
	private TipoVivienda tipoVivienda;
	private Valoracion valoraciones; /*mirar lo de arraylist*/
	private ArrayList<Comentario> comentarios; /*recursividad, solo un comentario, y cada comentario tiene un comentario*/
	private Calendar fechaIni;
	private Calendar fechaFin;
	private Boolean reservada;
	private Boolean alquilada;
	private EstadoOferta estado;


	/*private boolean aceptada;*/

	public Oferta(String nombreOferta, int numHabitaciones, int precio, int fianza, String descripcion, TipoVivienda tipoVivienda, Calendar fechaIni, Calendar fechaFin) {
		
		this.nombreOferta = nombreOferta;
		this.numHabitaciones = numHabitaciones;
		this.precio = precio;
		this.fianza = fianza;
		this.descripcion = descripcion;
		this.tipoVivienda = tipoVivienda;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		comentarios = new ArrayList<Comentario>();
		reservada = false;
		alquilada = false;
		estado = EstadoOferta.PENDIENTE;
	}
	
	public Boolean modificarOferta(){
		 if(estado != EstadoOferta.PENDIENTE){
		 	throw new IllegalArgumentException("Fallo en la reserva\n");
		 }
		 
		 int numM = 0;
		 String campo;
		 String modify;
		 int modi;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Campos a modificar:\n -nombreOferta  -numHabitaciones\n -precio  -fianza\n -fechaIni  -fechaFin\n");
		 System.out.print("Inserte el número de campos a modificar");
		 while(numM <= 0){
		 	numM = sc.nextInt();
		 }
		 
		 for(; numM != 0; numM--){
		 	System.out.print("Inserte el campo a modificar: \n");
			campo = sc.nextLine();
			
			if(campo.equals("nombreOferta")){
				System.out.print("Inserta el nuevo nombre de la oferta\n");
				modify = sc.nextLine();
				setNombreOferta(modify);
			}
			
			else if(campo.equals("numHabitaciones")){
				System.out.print("Inserta el nuevo número de habitaciones\n");
				modi = sc.nextInt();
				setNumHabitaciones(modi);
			}
			
			else if(campo.equals("precio")){
				System.out.print("Inserta el nuevo precio para la oferta\n");
				modi = sc.nextInt();
				setPrecio(modi);
			}
			
			else if(campo.equals("fianza")){
				System.out.print("Inserta la nueva fianza para la oferta\n");
				modi = sc.nextInt();
				setFianza(modi);
			}
			
			/*else if(campo.equals("fechaIni")){
				Sistem.out.print("Inserta la nueva fecha de inicio de la oferta\n");
				modify = sc.nextInt();
				setFianza(modify);
			}
			
			else if(campo.equals("fechaFin")){
				Sistem.out.print("Inserta la nueva fecha de fin de la oferta\n");
				modify = sc.nextInt();
				setFianza(modify);
			}*/
			
			else{
				System.out.print("El campo introducido no existe\n");
				numM++;
			}
		 }
		 
		 return true;
	}


    /*MIRAR ESTA Y LA SIGUIENTE PORQUE... /*HE AÑADIDO EL CAMPO AR A ARENDATARIO QUE SIGNIFICA OFERTA ALQUILADA/REVERVADA, Y LA OTRA OFERTA ES LA QUE ESTA MIRANDO /*/
	public Boolean reservarOferta(Arrendatario a){
		/*Calendar today = Calendar.getInstance();*/
		if(alquilada == true || reservada == true || a.getTipoUsuario() != TipoUsuario.ARRENDATARIO /*|| (a.oferta.getFechaIni()-today) <= 5*/){
			throw new IllegalArgumentException("Fallo en la reserva");
		}
		else{
			reservada = true;
			a.setOfertaAR(a.getOfertaVista());
			System.out.println("Oferta Reservada, dispone de un plazo de 5 días.");
			return true;
		}
	}

	public Boolean alquilarOferta(Arrendatario a){
		/*Calendar today = Calendar.getInstance();*/
		if(alquilada == true || reservada == true || a.getTipoUsuario() != TipoUsuario.ARRENDATARIO/*|| (a.oferta.getFechaIni()-today) <= 5*/){
			throw new IllegalArgumentException("Fallo en el alquiler");
		}
		else{
			alquilada = true;
			a.setOfertaAR(a.getOfertaVista());
			System.out.println("Oferta Alquilada, disfrute de su estancia.");
			return true;
		}
	}

	public boolean aprobarOferta (Gerente g){
		if(numHabitaciones>0 && precio>0 && fianza>0 && descripcion != null && nombreOferta != null && tipoVivienda != null && fechaIni != null && fechaFin != null){
			estado=EstadoOferta.ACEPTADA;
			return true;
		}
		
		estado = EstadoOferta.CAMBIO;
		return false;
	}

	public boolean rechazarOferta (){
		estado = EstadoOferta.RECHAZADA;
		return false;
	}

	public boolean cambiarOferta (){
		estado = EstadoOferta.CAMBIO;
		return false;
	}


	public boolean addComentario(Comentario comentario){
		if(comentario == null){
			throw new IllegalArgumentException("comentario incorrecto");
		}

		comentarios.add(comentario);
		System.out.println("Comentario añadido.");
		return true;
	}

	public boolean valorarOferta(int valor){
		if(valor>6 || valor<1){
			throw new IllegalArgumentException("valor incorrecta");
		}

		valoraciones.Valorar(valor);
		return true;
	}

	public String getNombreOferta() {
		return nombreOferta;
	}

	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getFianza() {
		return fianza;
	}

	public void setFianza(int fianza) {
		this.fianza = fianza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(TipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public Valoracion getValoraciones() {
		return valoraciones;
	}

	public void setValoraciones(Valoracion valoraciones) {
		this.valoraciones = valoraciones;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Calendar getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Calendar fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getReservada() {
		return reservada;
	}

	public void setReservada(Boolean reservada) {
		this.reservada = reservada;
	}

	public Boolean getAlquilada() {
		return alquilada;
	}

	public void setAlquilada(Boolean alquilada) {
		this.alquilada = alquilada;
	}

	public EstadoOferta getEstado() {
		return estado;
	}

	public void setEstado(EstadoOferta estado) {
		this.estado = estado;
	}
}