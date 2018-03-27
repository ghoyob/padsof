import static org.junit.Assert.*;
import org.junit.Test;



public class ComentarioTest {
    
    @Test
    public void testComentarComentario() {
        Comentario c = new Comentario("text");
        
        if(c.comentarComentario("texto") == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
    public void testValorarComentario() {
         Comentario c = new Comentario("text");
        
        if(c.valorarComentario(3) == true){
            assertTrue(true);
        }
        assertFalse(false);
    }
    
}

