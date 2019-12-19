/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales.Deber_areglos;

import java.util.Scanner;
public class Numero_mayor {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int mayor = 0,menor = 0,rep = 0;
        int numeros[] = new int[30];
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.println("Ingrese un numero: ");
            numeros[cont] = datos.nextInt();           
        }
        for (int cont = 0; cont < numeros.length; cont++) {
            if (cont == 1) {
                mayor = numeros[cont];
                menor = numeros[cont];
                rep = numeros[cont];
            }else{
                if (numeros[cont] > mayor) {
                    mayor = numeros[cont];
                }
                if (numeros[cont] < menor) {
                    menor = numeros[cont];
                }
                if (numeros[cont] == rep) {
                    rep = numeros[cont];
                }
            }
        }
        System.out.println("El numero mayor es:  " + mayor);
        System.out.println("El numero menor es:  "+  menor);
        System.out.println("El numero repetido es: : "+rep);
    }
}
