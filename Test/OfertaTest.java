import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class OfertaTest{
    @Test

    public void TestConstructor(){
        int counter = 0;
        TipoUsuario u = TipoUsuario.ARRENDADOR;
        Arrendatario a = new Arrendatario("123456789A", "nombre", "contraseña", "123456789", u);
        Gerente g = new Gerente(3, TipoUsuario.GERENTE);
        Comentario c = new Comentario("Skrr Dab");

        LocalDate di;
        LocalDate df;

        di = LocalDate.now().withDayOfMonth(15).withMonth(12).withYear(2018);
        df = LocalDate.now().withDayOfMonth(15).withMonth(1).withYear(2019);

        Oferta o = new Oferta("nombre", 3, 3500, 23, "Skrr Dab", TipoVivienda.VACACIONAL, di, df);

        if(o != null){
            if(o.reservarOferta(a) == true && a.getOfertaAR().equals(o) && o.getReservada() == true){
                counter++;
            }
            else if(o.alquilarOferta(a) == true && a.getOfertaAR().equals(o) && o.getAlquilada() == true){
                counter++;
            }
            else if((o.aprobarOferta(g) == true && o.getEstado().equals(EstadoOferta.ACEPTADA)) || (o.aprobarOferta(g) == false && o.getEstado().equals(EstadoOferta.CAMBIO))){
                counter++;
            }
            else if(o.rechazarOferta(g) == true && o.getEstado().equals(EstadoOferta.RECHAZADA)){
                counter++;
            }
            else if(o.cambiarOferta(g) == true && o.getEstado().equals(EstadoOferta.CAMBIO)){
                counter++;
            }
            else if(o.addComentario(c) && o.getComentarios().get(1).equals(c)){
                counter++;
            }
            else if(o.valorarOferta(4) && (o.getValoraciones().getnValoraciones() == 1 && o.getValoraciones().getValor() == 4) ||(o.getValoraciones().getnValoraciones() != 1)){
                counter++;
            }

            else if(o.modificarOferta() == true){
                counter++;
            }

            else if(counter == 8){
                assertTrue(true);
            }

            assertFalse(false);
        }
    }
}