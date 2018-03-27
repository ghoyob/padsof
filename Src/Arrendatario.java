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
    private Oferta ofertaVista;
    private Oferta AR;

    public Arrendatario(String dni, String nombre, String contrasenia, String numTarjeta, TipoUsuario u){
        super(dni, nombre, contrasenia, numTarjeta, u);
    }


    public Oferta getOfertaVista(){
        return this.ofertaVista;
    }

    public void setOfertaVista(Oferta oferta){
        this.ofertaVista=oferta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Oferta getOfertaAR() {
        return AR;
    }

    public void setOfertaAR(Oferta AR) {
        this.AR = AR;
    }
}
