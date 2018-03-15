/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public abstract class Registrado extends Usuario{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/

	private String nombre;
	private String contrasenia;
	private Boolean bloqueado;

	public Registrado(String nombre, String contrasenia){
		this.nombre=nombre;
		this.contrasenia=contrasenia;
		this.bloqueado = false;
		
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	
	public String getContrasenia(){
		return this.contrasenia;
	}
	
	public Boolean getBloqueado(){
		return this.bloqueado;
	}
	
	public void setBloqueado(Boolean bloqueado){
		this.bloqueado=bloqueado;
	}
	
	public void desbloquearUsuario(Registrado r){
		
		if(r == null){
			System.out.println("Error en el nombre al desbloquear usuario.");
			return; 
		}
	    
	    if(r.bloqueado == true){
	    	r.bloqueado = false;
	    	System.out.println("Usuario desbloqueado.");
	    	return;
	    }
	    
	    System.out.println("El usuario ya estaba desbloqueado.");
	    return;
	    
	}

}