import java.util.Calendar;
import java.util.Date;

public class Filtro {
    
	private TipoVivienda tipoVivienda;
	private int CP; 
	private boolean estadoAlquilado;
	private boolean estadoReservado;
	private int valoracion;
	private Date fechaIni;
	private Date fechaFin;
	private TipoUsuario tipoUsuario;
	
	public Filtro(TipoVivienda tipoVivienda, int CP, boolean estadoAlquilado, boolean estadoReservado, int valoracion, Date fechaIni, Date fechaFin) {
	    
		this.tipoVivienda = tipoVivienda;
		this.CP = CP;
		this.estadoAlquilado = estadoAlquilado;
		this.estadoReservado = estadoReservado;
		this.valoracion = valoracion;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}

	public Filtro(){
    }

	public boolean isEstadoAlquilado() {
		return estadoAlquilado;
	}

	public void setEstadoAlquilado(boolean estadoAlquilado) {
		this.estadoAlquilado = estadoAlquilado;
	}

	public boolean isEstadoReservado() {
		return estadoReservado;
	}

	public void setEstadoReservado(boolean estadoReservado) {
		this.estadoReservado = estadoReservado;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public TipoVivienda getTipoVivienda(){
		return tipoVivienda;
	}
	
	public int getValoracion(){
		return valoracion;
	}
	
	public int getCP(){
		return CP;
	}
	
	public boolean getEstadoAlquilado(){
		return estadoAlquilado;
	}
	
	public boolean getEstadoReservado(){
		return estadoReservado;
	}

	public void setCP(int CP) {
		this.CP = CP;
	}

	public void setTipoVivienda(TipoVivienda tipoVivienda) {
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

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
}