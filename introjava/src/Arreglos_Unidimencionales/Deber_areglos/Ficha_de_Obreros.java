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
public class Ficha_de_Obreros {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        String nombre [] = new String[4];
        int produccion[] = new int[4];
        int prod_dia[] = new int[4];
        int suma = 0;
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("Ingrede su nombre: ");
            nombre[cont] = datos.nextLine();
            System.out.println("Ingrese su produccion diaria");
            prod_dia[cont] =  Integer.parseInt(datos.nextLine());  
            suma = suma + prod_dia[cont];
        }            
        for (int cont = 0; cont < nombre.length; cont++) {
            System.out.println("           ANALISIS DE PRODUCCION");
            System.out.println("================================================");
            System.out.println("NOMBRE:                  ---> "+ nombre[cont]);
            System.out.println("PRODUCCION DIARIO        ---> "+ prod_dia[cont]);
            System.out.println("PRODUCCION MES:          ---> " + suma);          
        }
    }
}
