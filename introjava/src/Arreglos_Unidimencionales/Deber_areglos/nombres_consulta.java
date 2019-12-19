/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales.Deber_areglos;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class nombres_consulta {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombre[] = new String[20];
        String error = "error, ingrese una posicion valida";
        int pos;
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("Ingrese un nombre para el elemento: " + cont);
            nombre[cont] = datos.next();
        }
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese la posicion a consultar: ");
            pos = datos.nextInt();
            if (pos < 4) {
                System.out.println("el elemento guardado es: "+ nombre[pos]);
            }else {
                System.out.println("" + error);
            }

        }
    }
}
