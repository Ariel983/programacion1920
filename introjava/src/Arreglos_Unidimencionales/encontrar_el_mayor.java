/*
AUTORES:
    Luis Sarango
    Ariel Sarango
*/



package Arreglos_Unidimencionales;

import java.util.Scanner;

public class encontrar_el_mayor {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[10];
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Ingrese un numero");
            numeros[indice] = datos.nextInt();

        }
        int tam = numeros.length;
        for (int ind = 0; ind < numeros.length; ind++) {
            if (ind == (tam - 1)) {
                System.out.println(numeros[ind]);
            } else {
                System.out.print(numeros[ind] + ", ");
            }

        }
        int mayor = 0 ;
        for (int may = 0; may < numeros.length; may++) {
            if (numeros[may] > mayor) {
                mayor = numeros[may];
            }
        }
        System.out.println("El numero mayor de este arreglo es:  " + mayor);

    }
}
