import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class RegistradoTest{
    @Test

    public void TestConstructor(){
        Registrado r = new Registrado("123456789", "Skrr", "Dab", "4444555566668888", TipoUsuario.ARRENDADOR);

        if(r != null){
            r.setBloqueado(true);
            if(r.getBloqueado() == false){
                assertTrue(false);
            }

            r.desbloquearUsuario(r);
            if(r.getBloqueado() == false){
                assertTrue(true);
            }
        }
        assertFalse(false);
    }
}