import java.util.*;

/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */


public class Comentario{


    private String texto;
    private Valoracion valoracion;
    private Comentario comentario;

    public Comentario(String texto){
        this.texto = texto;
    }

    public Comentario getComentario(){
        return comentario;
    }

    public void setComentario(Comentario c){
        this.comentario = c;
        return;
    }

    public void setTexto(String texto){
        this.texto=texto;
    }

    public String getTexto(){
        return texto;
    }

    public Valoracion getValoracion(){
        return valoracion;
    }

    public Boolean comentarComentario(text){
        Comentario c = new Comentario(text);
        this.comentario = c;
        return true;
    }

    public Boolean valorarComentario(int valor){
        if(valor>6 || valor<1){
            throw new IllegalArgumentException("valoracion incorrecto");
            return false;
        }

        valoracion.Valorar(valor);
        return true;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }
}