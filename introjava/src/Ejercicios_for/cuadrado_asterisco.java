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
public class cuadrado_asterisco {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int fil;
        int col;
        System.out.println("Ingrese un numero de filas");
        fil = datos.nextInt();
        System.out.println("Ingrese el numero de columnas ");
        col = datos.nextInt();
        for (int  i = 0; i < fil; i++) {
            for (int cont = 0; cont < col; cont++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
