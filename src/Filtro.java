
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
}