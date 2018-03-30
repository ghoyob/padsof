import static org.junit.Assert.*;
import org.junit.Test;



public class    ArrendatarioTest {
    @Test
    
    public void TestConstructor(){
        TipoUsuario u = TipoUsuario.ARRENDADOR;
        Arrendatario a = new Arrendatario("123456789A", "nombre", "contraseña", "123456789", u);
    }
    /*Hay que poner geter y seter? DUDA :S NOPEE*/
    
    
}