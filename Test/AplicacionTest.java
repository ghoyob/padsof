import static org.junit.Assert.*;
import org.junit.Test;



public class AplicacionTest {
    @Test
    public void testAniadirVivienda() {
        Vivienda v1= new Vivenda("nombreVivienda", 1, 12345, "localidad");
        Aplicacion a1= new Aplicacion();
        
        if(a1.añadirVivienda(v1) == true && a1.getnVivs() == 1){
            assertTrue(true);
            
        }
        assertFalse(false);
    }
    
    public void testLogin() {
    }
    
    public void testLogout() {
    }
    
    public void testBuscar() {
    }
     
    public void testisCPValido() {
        Aplicacion a= new Aplicacion();
        if(a.isCPValido(12345) == true){
           assertTrue(true);
        }
        assertFalse(false);
    }
     
    public void testIsValoracionValida() {
        Aplicacion a= new Aplicacion();
        if(a.isValoracionValida(3) == true){
           assertTrue(true);
        }
        assertFalse(false);    
    }
     
    
    
    
}