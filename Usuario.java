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

	public Usuario(TipoUsuario u){
		this.u = u;
	}
	
	public TipoUsuario getTipoUsuario(){
		return this.u;
	}
	
	public void setTipoUsuario(TipoUsuario u){
		this.u = u;
	}

}
