import java.util.ArrayList;
import java.util.List;


/*Mejor un int e ir calculando la media*/
public class Valoracion {
    private int nValoraciones;
    private int valor;
    
    public Valoracion(int valor){
        this.valor = valor;
    }
    
    public Boolean

    @java.lang.Override
    public java.lang.String toString() {
        return "Valoracion{" +
                "valor=" + valor +
                '}';
    }

    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor){
        return this.valor = valor;
    }

    public void Valorar(int valor) {
        if (nValoraciones == 0){
            nValoraciones++;
            this.valor = valor;
            return;
        }
        
        else{
            nValoraciones++;
            this.valor = (this.valor + valor)/2;
            return;
        }
        
    }
}

/* object.ouput string... Fichero binario. Usar el flujo de salida de objetos
File output string String hacia un fichero de salida
Asi podemos guardar un objeto en un fichero
Implement serielizable*/