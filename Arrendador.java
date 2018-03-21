import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Arrendador extends Registrado{

    private Pago pago;
    private ArrayList<Vivienda> viviendas;

    public Arrendador(String nombre, String contrasenia, String numTarjeta, TipoUsuario u){
        viviendas = new ArrayList<Vivienda>();
        super(nombre, contrasenia, numTarjeta, u);
    }

    public ArrayList<Vivienda> getVivienda() {
        return viviendas;
    }
    
    public Boolean addVivienda(Vivienda vivienda){
        if(vivienda == null){
            throw new IllegalArgumentException("oferta incorrecta");
        }

        for(Vivienda viviendaAlmacenada: viviendas){
            if((viviendaAlmacenada).equals(vivienda)){
                System.out.println("Error. La vivienda introducida ya esta reservada.");
                return false;
            }
        }
        viviendas.add(vivienda);
        return true;
    }
    
    public Boolean addOferta(Oferta oferta){
        if(oferta == null){
            throw new IllegalArgumentException("oferta incorrecta");
        }

        for(Oferta ofertaAlmacenada: viviendas.getOfertas/**//**//**/){
            if((ofertaAlmacenada).equals(oferta)){
                System.out.println("Error. La oferta introducida ya esta reservada.");
                return false;
            }
        }
        
        viviendas.getOfertas.add(oferta);/**//**//**//**//**/
        return true;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public void setVivieda(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
}