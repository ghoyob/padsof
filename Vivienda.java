import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

/*SI LOS DATOS DE LA VIVIENDA ESTAM BIEN LA ACEPTAS, AUNQUE HAYA OFERTAS QUE NO ESTÉN ACEPTADAS*/
public class Vivienda

	//private static final Class<Valoracion[]>[] Valoracion = null;
	private String nombreVivienda;
	private int idVivienda;
	private int CP;
	private String localidad;
	private ArrayList<Oferta> ofertas;
	private EstadoOferta estado;
	/*private boolean aceptada;*/

	public Oferta(String nombreVivienda, int idVivienda, int CP, String localidad) {
		this.nombreVivienda = nombreVivienda;
		this.idVivienda = idVivienda;
		this.CP = CP;
		this.localidad = localidad;
		ofertas = new ArrayList<Oferta>();
		estado = EstadoOferta.PENDIENTE 
	}
	
	public Boolean añadirOferta(Oferta o){
		if(o == null || o.getEstado() != EstadoOferta.ACEPTADA){
			throw new IllegalArgumentException("Oferta incorrecta");
		}

		ofertas.add(o);
		System.out.println("Oferta añadida.");
		return true;
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
	
	public String getNombreVivienda() {
		return nombreOferta;
	}

	public void setNombreVivienda(String nombreVivienda) {
		this.nombreVivienda = nombreVivienda;
	}
	
	public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(ArrayList<Oferta> ofertas) {
        this.ofertas = ofertas;
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
	
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	public Boolean aprobarVivienda (Gerente g){
		if(g.getTipoUsuario() != tipoUsuario.GERENTE){
			throw new IllegalArgumentException("Vivienda incorrecta");
			return false;
		}

		if(isCPValido()==true && isLocalidadValida()==true && nombreVivienda != null && idVivienda != null){
			estado = EstadoOferta.ACEPTADA;
            return true;
		}
		
		return false;
	}
	
	
}