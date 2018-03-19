
public class Filtro {
    
	private String tipoVivienda;
	private int CP; 
	private Boolean estadoAlquilado;
	private Boolean estadoReservado;
	private int valoracion;
	private Calendar fechaIni;
	private Calendar fechaFin;
	
	public Filtro(String tipoVivienda, int CP, boolean estadoAlquilado, boolean estadoReservado, int valoracion, Calendar fechaIni, Calendar fechaFin) {
	    
		this.tipoVivienda = tipoVivienda;
		this.CP = CP;
		this.estadoAlquilado = estadoAlquilado;
		this.estadoReservado = estadoReservado;
		this.valoracion = valoracion;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}
	
	public String getTipoVivienda(){
		return tipoVivienda;
	}
	
	public int getValoracion(){
		return valoracion;
	}
	
	public int getCP(){
		return CP;
	}
	
	public Boolean getEstadoAlquilado(){
		return estadoAlquilado;
	}
	
	public String getEstadoReservado(){
		return estadoReservado;
	}

	public void setCP(int CP) {
		this.CP = CP;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public void setEstadoAlquilado(Boolean estadoAlquilado) {
		this.estadoAlquilado = estadoAlquilado;
	}

	public void setEstadoReservado(Boolean estadoReservado) {
		this.estadoReservado = estadoReservado;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
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
}