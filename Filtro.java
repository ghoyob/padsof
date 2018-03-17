
public class Filtro {
    
	private String tipoVivienda;
	private int CP; 
	private Boolean estadoAlquilado;
	private Boolean estadoReservado;
	private int valoracion;
	private Fecha fechaIni;

	public Filtro(String tipoVivienda, int CP, boolean estadoAlquilado, boolean estadoReservado, int valoracion) {
	    
		this.tipoVivienda = tipoVivienda;
		this.CP = CP;
		this.estadoAlquilado = estadoAlquilado;
		this.estadoReservado = estadoReservado;
		this.valoracion = valoracion;
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
	
	public Fecha getFecha(){
		return fechaIni;
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

	public Fecha getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Fecha fechaIni) {
		this.fechaIni = fechaIni;
	}
}