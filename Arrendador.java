import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Arrendador extends Registrado{

	private String numTarjeta;
	private Pago pago;
	private ArrayList<Oferta> ofertas;

	public Arrendador(String numTarjeta){
		this.numTarjeta= numTarjeta;
		ofertas = new ArrayList<Oferta>();
	}
	
	public String getNumTarjeta(){
		return this.numTarjeta;
	}
	
	public ArrayList<Oferta> getOfertas() {
		return ofertas;
	}

	public void setNumTarjeta(String numTarjeta){
	    if(numTarjeta == null){
	        System.out.println("Error en el numero de la tarjeta en set en Arrendador.");
			return; 
	    }
		this.numTarjeta=numTarjeta;
	    return;
	}
	
	public Boolean addOferta(Oferta oferta){
        if(oferta == null){
             throw new IllegalArgumentException("oferta incorrecta");
        }
        
        for(Oferta ofertaAlmacenada: ofertas){
            if((ofertaAlmacenada).equals(oferta)){
                System.out.println("Error. La oferta introducida ya esta reservada.");
                return false;
            }
        }
        ofertas.add(oferta);
        return true;
    }
}