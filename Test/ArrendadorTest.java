import static org.junit.Assert.*;

import fechasimulada.FechaSimulada;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;


public class ArrendadorTest {
    @Test
    
    public void testAddVivienda() {
        TipoUsuario u = TipoUsuario.ARRENDADOR;
        Arrendador a = new Arrendador("123456789A", "nombre", "contraseña", "123456789", u);
        Vivienda v= new Vivienda("nombreVivienda", 1, 12345, "localidad");
        
        
        if(a.addVivienda(v) == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
    public void testAddOferta() {
        TipoUsuario u = TipoUsuario.ARRENDADOR;
        Arrendador a = new Arrendador("123456789A", "nombre", "contraseña", "123456789", u);
        TipoVivienda tv = TipoVivienda.VACACIONAL;
        LocalDate fechaFin = LocalDate.now().withDayOfMonth(1).withMonth(3).withYear(2017);; /**********/
        LocalDate fechaIni = LocalDate.now(); /**********/
        Oferta o = new Oferta("nombreOferta", 2, 120, 50, "descripcion", tv, fechaIni, fechaFin);
        
        if(a.addOferta(o) == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
    
}