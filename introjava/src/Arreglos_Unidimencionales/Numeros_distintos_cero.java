
package Arreglos_Unidimencionales;

import java.util.Scanner;
/*
AUTOR:
    Ariel Sarango
*/
public class Numeros_distintos_cero {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[4];
        int iguales = 0;
        int menores = 0;
        int mayores = 0;
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.println("Ingrese un numero");
            numeros[cont] = datos.nextInt();
        }
        for (int cont = 0; cont < numeros.length; cont++) {
            if (numeros[cont] == 0) {
                iguales++;
            } else {
                if (numeros[cont] < 0) {
                    menores++;
                }
                if (numeros[cont] > 0) {
                    mayores++;
                }
        
            }
            System.out.print(numeros[cont] + " ");
        }
        System.out.println("");
        System.out.println("numeros iguales que cero:  " + iguales);
        System.out.println("numeros menores que cero:  " + menores);
        System.out.println("numeros mayores que cero:  " + mayores);
    }
}
