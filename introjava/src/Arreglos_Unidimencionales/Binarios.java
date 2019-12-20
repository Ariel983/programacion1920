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
public class Binarios {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        long num, cociente;
        String binario = "";
        System.out.println("Convertir decimal a binario");
        System.out.println("---------------------------\n");
        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = datos.nextLong();
            if (num <= 0) {
                System.out.println("\n¡Debe ingresar un entero positivo!\n");
            }
        } while (num <= 0);
        cociente = num;
        while (cociente > 1) {
            binario = (cociente % 2) + binario;
            cociente = cociente / 2;                //División entera
        }
        binario = cociente + binario;
        System.out.println("\nEl número " + num + " representado en el sistema binario es " + binario);
    }
}
