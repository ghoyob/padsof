/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Arrendatario extends Registrado{

    /*
     * Declaración de los atributos de las clases.
     *También se inicializan las variables
     */

    
    private Pago pago;
    private Oferta oferta;

    public Arrendatario(){
    }


    public Oferta getOferta(){
        return this.oferta;
    }

    public void setOferta(Oferta oferta){
        if(oferta == null){
            System.out.println("Error en el numero de la tarjeta en set en Arrendatario.");
        }

        this.oferta=oferta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
