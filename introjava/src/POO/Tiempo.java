
package POO;
/**
 *
 * @author byron
 */
public class Tiempo {
    //atributos de la clase, se declaran en forma global.
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){
      System.out.println("Se ha iniciado la clase tiempo");  
    }
    
    /**
     * Este metodo es el constructor de la clase.
     * El contructor se ejecuta al momento de crear un objeto para la clase tiempo
     */
    public Tiempo(int hora, int minuto, int segundo){
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;       
    }
    
    /**
     * Metodo que encapsula o emvuelve al atributo hora.
     * Y sirve para devolver el valor que tiene la variable hora
     * @return 
     */
    public int Obtener_hora() {
        return hora;
    }
    /**
     * Metodo que encapsula o emvuelve al atributo minuto.
     * Y sirve para devolver el valor que tiene la variable minuto
     * @return 
     */
    public int Obtener_minuto(){
        return minuto;
    }
    /**
     * Metodo que encapsula o emvuelve al atributo segundo.
     * Y sirve para devolver el valor que tiene la variable segundo
     * @return 
     */
    public int Obtener_Segundo(){
        return segundo;
    }
    
    /**
     * Metodo para obtener el tiempo real
     * @return tiempo
     */
    public String Obtener_Tiempo_Real(){
        String tiempo = hora +":" + minuto + ":" + segundo;
        return tiempo;
        
    }
    
}

