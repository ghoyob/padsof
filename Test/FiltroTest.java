import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class FiltroTest{
    @Test

    public void TestConstructor(){
        LocalDate di;
        LocalDate df;

        di = LocalDate.now().withDayOfMonth(15).withMonth(12).withYear(2018);
        df = LocalDate.now().withDayOfMonth(15).withMonth(1).withYear(2019);

        Filtro f = new Filtro(TipoVivienda.VACACIONAL, 11111, false, false, 4, di, df);

        if(f != null){
            assertTrue(true);
        }

        assertFalse(false);
    }
}