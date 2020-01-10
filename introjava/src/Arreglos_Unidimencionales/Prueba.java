/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales;

import java.util.Scanner;

/*AUTOR:
        Ariel Sarango
 */
public class Prueba {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su arreglo");
        int num = datos.nextInt();
        int numeros[] = new int[num];
        int cuadrados[] = new int[num];
        int proceso[] = new int[num];
        int suma =0;
        int par =0;
        for (int ind = 0; ind < numeros.length; ind++) {
            System.out.println("Ingrese un numero");
            numeros[ind] = datos.nextInt();
        }
        System.out.println("NUMEROS.");
        for (int ind = 0; ind < numeros.length; ind++) {
            System.out.print(numeros[ind] + " ");
        }
        //proceso de la operacion
        System.out.println();
        System.out.println("PROCESO");
        for (int i = 0; i < cuadrados.length; i++) {
            System.out.print(numeros[i] + "*" + numeros[i] + " ");
        }
        //proceso de elevar al cuadrado
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = (int) Math.pow(numeros[i],2);
        }
        //mostrar el proceso ya calculado
        System.out.println("CUADRADO");
        for (int ind = 0; ind < cuadrados.length; ind++) {
            System.out.print(cuadrados[ind] + " ");
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                suma = suma + numeros[i];
            }
        }
        System.out.println("la suma de sus pares, es:");
        for (int ind = 0; ind < 1; ind++) {
            System.out.println(suma);
        }
    }
}
