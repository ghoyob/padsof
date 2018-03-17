/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Aplicacion{

	/*
	 * Declaración de los atributos de las clases.
	 *También se inicializan las variables
	 */

	private ArrayList<Oferta> ofertas;

	public Aplicacion(){
		ofertas = new ArrayList<Oferta>();

	}

	public Boolean añadirOferta(Oferta o){
		if(o == null || o.getEstado() != ACEPTADA){
			throw new IllegalArgumentException("Oferta incorrecto");
		}

		ofertas.add(o);
		System.out.println("Oferta añadido.");
		return true;
	}

    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(ArrayList<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
}