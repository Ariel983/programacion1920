/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_for;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class cuadro_de_asteriscos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int fila;
        int columnas;
        System.out.println("Ingrese el numero de filas ");
        fila = datos.nextInt();
        System.out.println("Ingrese el numero de columnas ");
        columnas = datos.nextInt();
        for (int cont1 = 0; cont1 < fila; cont1++) {
            for (int cont2 = 0; cont2 < columnas; cont2++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
