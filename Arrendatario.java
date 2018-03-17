/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Arrendatario extends Registrado{

    /*
     * Declaración de los atributos de las clases.
     *También se inicializan las variables
     */

    private String numTarjeta;
    private Pago pago;
    private Oferta oferta;

    public Arrendatario(String numTarjeta){
        this.numTarjeta = numTarjeta;
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
