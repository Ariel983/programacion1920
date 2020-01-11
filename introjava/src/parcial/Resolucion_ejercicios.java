/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**AUTOR.
 *      Ariel Sarango
 */
public class Resolucion_ejercicios {
    
    /**
     * metodo para verificar si un numero es par o no
     * @param numero
     * @return 
     */
    public static boolean Detectar_par(int numero) {
         boolean res = false;
        if (numero % 2 == 0) {
            res = true;
        }
        return res;
    }
    
     //  public static void Detectar_par_V2(int numero) {
     //    boolean res = false;
     //   if (numero % 2 == 0) {
     //       res = true;
     //   }
     //}
    
    
    
    public static void main(String[] args) {
        int numeros[] = {2,3,4,2,4,5,6,2,1,2};
        //creamos segundo arreglo con igual tama;o que el arrgelo numeros
        int cuadrados[] = new int [numeros.length];
        //arreglo para almacenar el proceso de la operacion
        String procesos [] = new String[numeros.length];
        //creamos un ciclo de repeticion para recorrer el arreglo.
        for (int ind = 0; ind < numeros.length; ind++) {
            cuadrados[ind] = numeros[ind] * numeros[ind];
            procesos[ind] = numeros[ind] + "*" +numeros[ind];
        }
        String print_numero ="numeros = ";
        String print_proceso = "proceso = ";
        String print_cuadrados = "cuadrados = ";
        for (int i = 0; i < numeros.length; i++) {
            print_numero = print_numero + numeros[i] +" " ;
            print_proceso = print_proceso + procesos[i] + " ";
            print_cuadrados = print_cuadrados + cuadrados[i] + " ";                     
        }
        System.out.println(print_numero);
        System.out.println(print_proceso);
        System.out.println(print_cuadrados);
        
        // suma de los numeros pares
        int acum = 0;
        for (int ind = 0; ind < numeros.length; ind++) {
            boolean par = Detectar_par(numeros[ind]);
            if (par == true) {
                acum = acum + numeros[ind];
            }
        }
        System.out.println("La suma de los numeros pares es:" + acum);
        
    }
    
}
