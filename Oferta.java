import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */


public class Oferta{

	//private static final Class<Valoracion[]>[] Valoracion = null;
	private String nombreOferta;
	private int idVivienda;
	private int CP;
	private int numHabitaciones;
	private String localidad;
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

	public Oferta(String nombreOferta,int idVivienda, int CP, int numHabitaciones, String localidad, int precio, int fianza, String descripcion, TipoVivienda tipoVivienda, Calendar fechaIni, Calendar fechaFin) {

		this.nombre_oferta = nombreOferta;
		this.idVivienda = idVivienda;
		this.CP = CP;
		this.numHabitaciones = numHabitaciones;
		this.localidad = localidad;
		this.precio = precio;
		this.fianza = fianza;
		this.descripcion = descripcion;
		this.tipoVivienda = tipoVivienda;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		comentarios = new ArrayList<Comentario>();
		reservada = false;
		alquilada = false;
		estado = PENDIENTE;
	}

	public boolean isCPValido(){
		if(CP == null) return false;

		if(CP<100000 && CP >00000){
			return true;
		}
		return false;
	}

	public boolean isLocalidadValida(){
		if(localidad == null) return false;
		else return true;
	}

	public Boolean reservarOferta(Arrendatario a){
		/*Calendar today = Calendar.getInstance();*/
		if(alquilada == true || reservada == true || a.getTipoUsuario() != ARRENDATARIO /*|| (a.oferta.getFechaIni()-today) <= 5*/){
			throw new IllegalArgumentException("Fallo en la reserva");
			return false;
		}
		else{
			reservada = true;
			a.setOferta(oferta);
			System.out.println("Oferta Reservada, dispone de un plazo de 5 días.");
			return true;
		}
	}

	public Boolean alquilarOferta(Registrado r){
		/*Calendar today = Calendar.getInstance();*/
		if(alquilada == true || reservada == true || a.getTipoUsuario() != ARRENDATARIO/*|| (a.oferta.getFechaIni()-today) <= 5*/){
			throw new IllegalArgumentException("Fallo en el alquiler");
			return false;
		}
		else{
			alquilada = true;
			a.setOferta(oferta);
			System.out.println("Oferta Alquilada, disfrute de su estancia.");
			return true
		}
	}

	public Boolean aprobarOferta (Gerente g){
		if(g.getTipoUsuario() != GERENTE){
			throw new IllegalArgumentException("oferta incorrecta");
			return false;
		}

		if(isCPValido()==true && numHabitaciones>0 && isLocalidadValida()==true && precio>0 && fianza>0 && descripcion != null && nombreOferta != null){
			estado=ACEPTADA;
			return true;
		}
		
		estado = CAMBIO;
		return false;
	}

	public Boolean rechazarOferta (){
		estado = RECHAZADA;
		return false;
	}

	public Boolean cambiarOferta (){
		estado = CAMBIO;
		return false;
	}

	public int CalcularBeneficio (){
		return beneficio;

	}

	public Boolean addComentario(Comentario comentario){
		if(comentario == null){
			throw new IllegalArgumentException("comentario incorrecto");
		}

		comentarios.add(comentario);
		System.out.println("Comentario añadido.");
		return true;
	}

	public Boolean valorarOferta(int valor){
		if(valor>6 || valor<1){
			throw new IllegalArgumentException("valor incorrecta");
			return false;
		}

		valoracion.Valorar(valor);
		return true;
	}

	public String getNombreOferta() {
		return nombreOferta;
	}

	public void setNombreOferta(String nombreOferta) {
		this.nombreOferta = nombreOferta;
	}

	public int getIdVivienda() {
		return idVivienda;
	}

	public void setIdVivienda(int idVivienda) {
		this.idVivienda = idVivienda;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int CP) {
		this.CP = CP;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	public Calenda getFechaIni() {
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