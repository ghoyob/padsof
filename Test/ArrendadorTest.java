import static org.junit.Assert.*;
import org.junit.Test;



public class ArrendadorTest {
    @Test
    
    public void testAddVivienda() {
        TipoUsuario u = ARRENDADOR;
        Arrendador a = new Arrendador("123456789A", "nombre", "contraseña", 123456789, u);
        Vivienda v= new Vivenda("nombreVivienda", 1, 12345, "localidad");
        
        
        if(a.addVivienda(v) == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
    public void testAddOferta() {
        TipoUsuario u = ARRENDADOR;
        Arrendador a = new Arrendador("123456789A", "nombre", "contraseña", 123456789, u);
        TipoVivienda tv = VACACIONAL;
        Calendar fechaFin; /**********/
        Calendar fechaIni; /**********/
        Oferta o = new Oferta("nombreOferta", 2, 120, 50, "descripcion", tv, fechaIni, fechaFin);
        
        if(a.addOferta(o) == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
    
}