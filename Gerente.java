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

	public Gerente(int id){
		this.id = id;
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
