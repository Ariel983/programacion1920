
package Arreglos_Unidimencionales;

import java.util.Arrays;

/*
INTEGRANTES:
        Luis Sarango
        Ariel Sarango
 */
public class almacenar_datos {

    public static void main(String[] args) {
        char arreglo1[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        char arreglo2[] = {'g', 'h', 'i', 'j', 'k'};
        char arreglo3[] = new char[11];
        int suma = 0;
        System.out.println(Arrays.toString(arreglo1));
        System.out.println(Arrays.toString(arreglo2));
        
        for (int indice = 0; indice < 6; indice++) {
            arreglo3[indice] = arreglo1[indice];
        }

        for (int i = 6; i < 11; i++) {
            arreglo3[i] = arreglo2[i - 6];
        }
        int tam = arreglo3.length;
        for (int i = 0; i < 11; i++) {
            if (i == tam - 1) {
                System.out.print(arreglo3[i]);
            } else {
                System.out.print(arreglo3[i] + ", ");
            }
        }
    }
}
