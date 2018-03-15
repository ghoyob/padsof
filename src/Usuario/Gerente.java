package Usuario;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Gerente extends Registrado{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/

    private Integer id;

	public Gerente(int id){
		this.id = id;
	}

    public Integer getId(){
        return this.id;
    }

}
