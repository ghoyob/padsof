import java.util.ArrayList;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Arrendador extends Registrado {

    private Pago pago;
    private ArrayList<Vivienda> viviendas;

    public Arrendador(String dni, String nombre, String contrasenia, String numTarjeta, TipoUsuario u) {
        super(dni, nombre, contrasenia, numTarjeta, u);
        viviendas = new ArrayList<Vivienda>();

    }

    public ArrayList<Vivienda> getVivienda() {
        return viviendas;
    }

    public Boolean addVivienda(Vivienda vivienda) {
        if (vivienda == null) {
            throw new IllegalArgumentException("oferta incorrecta");
        }

        for (Vivienda viviendaAlmacenada : viviendas) {
            if ((viviendaAlmacenada).equals(vivienda)) {
                System.out.println("Error. La vivienda introducida ya esta reservada.");
                return false;
            }
        }
        viviendas.add(vivienda);
        return true;
    }

    public boolean addOferta(Oferta oferta) {
        int i = 0;

        if (oferta == null) {
            throw new IllegalArgumentException("oferta incorrecta");
        }

        for(Oferta ofertaAlmacenada : viviendas.get(i).getOfertas()){
            if ((ofertaAlmacenada).equals(oferta)) {
                System.out.println("Error. La oferta introducida ya esta reservada.");
                return false;
            }
        } /*Tiene toda la pinta de que esta mal*/
        viviendas.get(i).getOfertas().add(oferta);
        return true;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public ArrayList<Vivienda> getViviendas() {
        return viviendas;
    }

    public void setViviendas(ArrayList<Vivienda> viviendas) {
        this.viviendas = viviendas;
    }
}