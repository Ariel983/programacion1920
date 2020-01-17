
package POO;

/**
 *
 * @author byron
 */
public class Ejecuta_Tiempo {
    public static void main(String[] args) {
        //instanciamos a la clase tiempo. P ara ello creamos un objeto.
        Tiempo tiempo = new Tiempo(20,44,17);
        System.out.println("Valor de hora " + tiempo.Obtener_hora());
        System.out.println("Valor de minutos " + tiempo.Obtener_minuto());
        System.out.println("Valor de segundo " + tiempo.Obtener_Segundo());
        System.out.println("Tiempo: " + tiempo.Obtener_Tiempo_Real());
        
        //vamos a crae un segundo objeto de la clase tiempo
        Tiempo t = new Tiempo(21,51,30);
        System.out.println("valor de hora: " + t.Obtener_hora());
    }
}
