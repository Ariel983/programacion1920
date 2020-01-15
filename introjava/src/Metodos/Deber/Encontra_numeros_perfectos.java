package Metodos.Deber;

import java.util.Scanner;

/*AUTOR
        Ariel Sarango.
Determinar su un numero es perfecto o no
NUMEROS PERFECTOS --> Un numero perfecto es igual a la sulma de sus divisores, excepruando el mismo.
 */
public class Encontra_numeros_perfectos {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //System.out.println("Ingrese el limite para determinar los numeros perfectos");
        //int perfecto = datos.nextInt();
        Determinar_Perfecto(10000);
    }

    /**
     * Metodo para encontrar los numeros perfectos
     *
     * @param num --> es el limite al que vamos a buscar cuantos numeros
     * perfectos existen
     */
    public static void Determinar_Perfecto(int num) {
        int com = 0;
        int div = 0;
        int sum = 0;
        int sum2 = 0 ;
        System.out.println("   NUMEROS PERFECTOS");
        System.out.println("======================");

        while (com <= num) {
            com++;
            for (com = 1; com <= num; com++) {
                sum = 0;
                for (div = 1; div < com; div++) {
                    if (com % div == 0) {
                        sum = sum + div;
                    }
                }
                if (com == sum) {
                    System.out.println("\t" + div);
                    System.out.println("======================");
                    sum2 = sum2 + com;
                    
                    
                }
             
            }
               System.out.println("La suma de los numeros perfectos es:" + sum2);
        }
       

    }

}
