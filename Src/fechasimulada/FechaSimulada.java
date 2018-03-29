package fechasimulada;

import java.time.LocalDate;
/**
 * Clase auxiliar para permitir pruebas con "fechas simuladas" y controladas
 * @author Profesores PADSOF
 *
 */
public class FechaSimulada {

    // inicializacion por defecto a una fecha fija, NO CAMBIAR
    private static LocalDate fechaSimulada
            = LocalDate.now().withDayOfMonth(1).withMonth(3).withYear(2017);

    /**
     * Avanza numDias la fecha simulada actual, o la retrasa si numDias es negativo
     *
     * @param numDias
     */
    public static void avanzar(int numDias) {
        fechaSimulada = fechaSimulada.plusDays(numDias);
    }

    /**
     */
    public static void restablecerHoyReal() {
        fechaSimulada = LocalDate.now();
    }
}
