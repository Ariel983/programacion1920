
package introjava;

/**
 *
 * @author byron
 */

/*Clase para intercambiar el contenido entre variables, con la ayuda de una 
  variable auxiliar*/
public class Intercambio {
    public static void main(String[] args) {
        
        String vaso_jugo = "contiene jugo";
        String vaso_gaseosa ="contiene sprint";
        String vaso_auxiliar = "";
        System.out.println("vaso jugo="+vaso_jugo);
        System.out.println("vaso gaseosa="+vaso_gaseosa);
        System.out.println("paso uno: paso el jugo al vaso auxiliar");
        vaso_auxiliar = vaso_jugo;
        System.out.println("el vaso auxiliar:"+vaso_jugo);
        System.out.println("paso 2: Pasamos el vaso de la gaseosa al vaso del jugo");
        vaso_jugo = vaso_gaseosa;
        System.out.println("el vaso de jugo: "+vaso_jugo);
        vaso_gaseosa = vaso_auxiliar;
        System.out.println("paso 3: pasamos el vaso auxiliar al vaso de la gaseosa");
        vaso_gaseosa = vaso_jugo;
        System.out.println("el vaso de gaseosa: "+vaso_auxiliar);
    }
    
}
