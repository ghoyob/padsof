/**
 * @author Aurora Perez y Guillermo Hoyo
 *
 */

public class Fecha{

/* 
   * Declaración de los atributos de las clases.
   *También se inicializan las variables 
*/
private int mes=0;
private int anyo=0;
private int dia=0;

	public Fecha(int anyo, int mes, int dia){
		this.mes=mes;
		this.anyo=anyo;
		this.dia=dia;
	}
   
   public Boolean isFechaValida(){
       if(anyo>2018 || mes>12 || mes<1 || dia<1){
           return false;
       }
       else if(mes==2 && anyo%4==0){
           if(dia>29) return false;
       }
       else if(mes==2 && anyo%4!=0){
           if(dia>28) return false;
       }
       else if(mes== 1 ||mes== 3 || mes== 5 || mes== 7 ||mes== 8 ||mes== 10 ||mes== 12){
           if(dia>31) return false;
       }
       else if(mes== 4 ||mes== 6 || mes== 9 || mes== 11 ){
           if(dia>31) return false;
       }
      return true;
   }	
   
   	public String toString() {
		return "" + anyo + "-" + mes + "-" + dia;
	}

}
