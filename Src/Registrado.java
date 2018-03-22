/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Registrado extends Usuario{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/

	private String nombre;
	private String dni;
	private String contrasenia;
	private boolean bloqueado;
	private String numTarjeta;
	

	public Registrado(String dni, String nombre, String contrasenia, String numTarjeta, TipoUsuario u){
        super(u);
	    this.dni = dni;
		this.nombre=nombre;
		this.contrasenia=contrasenia;
		this.bloqueado = false;
		this.numTarjeta= numTarjeta;
		
		
	}
	
	public String getDni(){
		return this.dni;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	
	public String getContrasenia(){
		return this.contrasenia;
	}
	
	public String getNumTarjeta(){
        return this.numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta){
        if(numTarjeta == null){
            System.out.println("Error en el numero de la tarjeta en set en Arrendatario.");
            return;
        }

        this.numTarjeta=numTarjeta;
        return;
    }
	
	public boolean getBloqueado(){
		return this.bloqueado;
	}
	
	public void setBloqueado(boolean bloqueado){
		this.bloqueado=bloqueado;
	}
	
	public void desbloquearUsuario(Registrado r){
		
		if(r == null || r.getTipoUsuario() == TipoUsuario.GERENTE){
			System.out.println("Error en el nombre al desbloquear usuario.");
			return; 
		}
	    
	    else{
	    	if(r.bloqueado == true){
	    	r.bloqueado = false;
	    	System.out.println("Usuario desbloqueado.");
	    	return;
	    }
	    
	    System.out.println("El usuario ya estaba desbloqueado.");
	    return;
	    }
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}