/*Mejor un int e ir calculando la media*/
public class Valoracion {
    private int nValoraciones;
    private int valor;
    
    public Valoracion(int valor){
        this.valor = valor;
        this.nValoraciones = 0;
    }

    public int getValor() {
        return valor;
    }
    
    public int setValor(int valor){
        return this.valor = valor;
    }

    public int getnValoraciones() {
        return nValoraciones;
    }

    public void setnValoraciones(int nValoraciones) {
        this.nValoraciones = nValoraciones;
    }

    public void Valorar(int valor) {
        if (nValoraciones == 0){
            nValoraciones++;
            this.valor = valor;
        }
        
        else{
            nValoraciones++;
            this.valor = (this.valor + valor)/2;
        }
        
    }
}

/* object.ouput string... Fichero binario. Usar el flujo de salida de objetos
File output string String hacia un fichero de salida
Asi podemos guardar un objeto en un fichero
Implement serielizable*/