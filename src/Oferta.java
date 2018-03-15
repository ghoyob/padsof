import Usuario.Arrendatario;
import Usuario.Gerente;
import Usuario.Registrado;

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
    private ArrayList<Valoracion> valoraciones; /*mirar lo de arraylist*/
    private ArrayList<Comentario> comentarios; /*recursividad, solo un comentario, y cada comentario tiene un comentario*/
    private Fecha fechaIni;
    private Fecha fechaFin;
    private Boolean reservada;
    private Boolean alquilada;
    private EstadoOferta estado;
    
    
    /*private boolean aceptada;*/
    
    public Oferta(String nombreOferta,int idVivienda, int CP, int numHabitaciones, String localidad, int precio, int fianza, String descripcion, TipoVivienda tipoVivienda, Valoracion valoracion, Comentario comentario, Fecha fechaIni, Fecha fechaFin) {
	    
		this.nombre_oferta = nombre_oferta;
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
		this.valoraciones = new ArrayList<Valoracion>();
		this.comentarios = new ArrayList<Comentario>();
		this.reservada = false;
		this.alquilada = false;
		this.estado = PENDIENTE;
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
	
	public Boolean reservarOferta(Oferta o, Arrendatario a){
		if(o.alquilada == true || o.reservada == true || a.getTipoUsuario() != ARRENDATARIO/*||comprobar fechas*/){
			throw new IllegalArgumentException("Fallo en la reserva");
			return false;
		}
		else{
			o.reservada = true;
			a.setOferta(oferta);
			System.out.println("Oferta Reservada, dispone de un plazo de 5 días.");
			return true;
		}
	}
	
	public Boolean alquilarOferta(Oferta o, Registrado r){
		if(o.alquilada == true || o.reservada == true || a.getTipoUsuario() != ARRENDATARIO/*||comprobar fechas*/){
			throw new IllegalArgumentException("Fallo en el alquiler");
			return false;
		}
		else{
			o.alquilada = true;
			a.setOferta(oferta);
			System.out.println("Oferta Alquilada, disfrute de su estancia.");
			return true
		}
	}
	
	public Boolean aprobarOferta (Oferta o, Gerente g){
		if(o == null || g.getTipoUsuario() != GERENTE){
			throw new IllegalArgumentException("oferta incorrecta");
			return false;
		}
		
		if(isCPValido()==true && numHabitaciones>0 && isLocalidadValida()==true && precio>0 && fianza>0 && descripcion != null && nombreOferta != null){
			return true;
		}
		cambiarOferta(o);
		return false;
	}
	
	public Boolean rechazarOferta (Oferta o){
		return false;
    }
    
	public Boolean cambiarOferta (Oferta o){
		return false;
	}
	
	public Boolean añadirOferta(){
		return false;
	}
	
	/*public String ProponerCambio (Oferta o){
		return "klk";
	}*/
	
	public int CalcularBeneficio (Oferta o){
		return beneficio;
	    
	}
	
}