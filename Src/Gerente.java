/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Gerente{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/
    private String nombre;
	private String contrasenia;
    private Integer id;
    private TipoUsuario tipoUsuario;

	public Gerente(int id, TipoUsuario tipoUsuario){
		this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre(){
		return this.nombre;
	}
	
	public String getContrasenia(){
		return this.contrasenia;
	}
    
    public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


}
