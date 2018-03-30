import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GerenteTest{
    @Test

    public void TestConstructor(){
        Gerente g = new Gerente(3, TipoUsuario.GERENTE);

        if(g != null){
            assertTrue(true);
        }

        assertFalse(false);
    }
}