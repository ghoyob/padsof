/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Pago{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/


	public Pago(){
		
	}


    public boolean confirmarPago(Arrendatario a){
		return true;
        
    }
    
    public void bloquearUsuario(Registrado r){
        if (r == null){
            System.out.println("Error en el nombre al desbloquear usuario.");
            return;
        }
        
        else{
            if (r.getBloqueado() == false){
                System.out.println("Usuario bloqueado.");
                r.setBloqueado(true);
                return;
            }
            
            System.out.println("El usuario ya estaba bloqueado.");
            return;
        }
    }
	

}
