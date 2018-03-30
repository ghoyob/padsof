import java.time.LocalDate;
import java.util.Date;
import java.util.Date;

public class Filtro {
    
	private TipoVivienda tipoVivienda;
	private int CP; 
	private boolean estadoAlquilado;
	private boolean estadoReservado;
	private int valoracion;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
	private TipoUsuario tipoUsuario;
	
	public Filtro(TipoVivienda tipoVivienda, int CP, boolean estadoAlquilado, boolean estadoReservado, int valoracion, LocalDate fechaIni, LocalDate fechaFin) {
	    
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

	public LocalDate getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}
	
	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
}