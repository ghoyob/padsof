package Usuario;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public abstract class Usuario{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/
	private TipoUsuario u;

	public Usuario(){
		
	}
	
	public TipoUsuario getTipoUsuario(){
		return this.u;
	}

}
