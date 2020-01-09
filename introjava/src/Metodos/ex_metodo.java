
package Metodos;
//Determinar si un numero es par
import java.util.Scanner;
/*AUTOR 
        Ariel Sarango
 */
public class ex_metodo {

    //llamar el metodo determinar_par
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = datos.nextInt();  
        //cunado el metodo no retorna valores
        //determinar_par(num); 
        //cuando el metodo retorna valores
        String msg = determinar_par_V2(num);//recibimos el valor que retorna el metodo 
        System.out.println(msg);
      
    }
    /**
     * es un metodo que si retorna valor
     * @param num es mi valor que se evalua para determinar si es par o no
     * @return 
     */
    public static String determinar_par_V2(int num){
        String mensaje = "";
         if (num % 2 == 0) {
            mensaje="es un numero  par";
        } else {
            mensaje = "no es un numero par";
        }
         return mensaje;
    } 
    //el nombre del metodo simepre debe tener un nombre en verbo infinitivo
    /**
     * es un metodo que no devuelve valor
     * este metodo es para determinar si un numero es par  o no es
     * @param numero es mi valor que se evalua para determinar si es par o no
     */
    public static void determinar_par(int numero) {
        if (numero % 2 == 0) {
            System.out.println("si es un numero par");
        } else {
            System.out.println("no es un numero par");
        }
    }
}
