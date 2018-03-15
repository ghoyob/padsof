import java.util.ArrayList;
import java.util.List;


/*Mejor un int e ir calculando la media*/
public class Valoracion {
    private ArrayList <Integer> valor;
    
    public Valoracion(List<Integer> valor){
        this.valor = new ArrayList(valor);
    }
    
    public boolean ValorarOferta(Oferta o){
		return true;
        
    }
    
    public boolean ValorarComentario(Oferta o){
		return true;
        
    }
}

/* object.ouput string... Fichero binario. Usar el flujo de salida de objetos
File output string String hacia un fichero de salida
Asi podemos guardar un objeto en un fichero
Implement serielizable*/