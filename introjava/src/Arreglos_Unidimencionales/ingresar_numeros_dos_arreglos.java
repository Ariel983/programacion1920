/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales;

import java.util.Scanner;

/*
INTEGRANTES:
        Luis Sarango
        Ariel Sarango
*/
public class ingresar_numeros_dos_arreglos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int conjunto1 [] = new int[5];
        int conjunto2 [] = new int [5];
        int conjunto3 [] = new int[5];
        int suma =0;
        int num;
        //ingrear valores para el primer conjunto
        for (int indice = 0; indice < 5; indice++) {
            System.out.println("Ingrese los numero del primer conjunto:");
            num = datos.nextInt();
            conjunto1[indice]= num;
        }
        //ingresar valores para el segundo conjunto
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los numero del segundo conjunto");
            num = datos.nextInt();
            conjunto2[i] = num;
        }
        //lectura del primer conjunto
       int acum_conjunto = 0;
        for (int i = 0; i < conjunto1.length; i++) {
            acum_conjunto = acum_conjunto + conjunto1[i];
            System.out.print(conjunto1[i]+" ");
        }
        //lectura del segundo conjunto
        System.out.println("");
        for (int i = 0; i < conjunto2.length; i++) {
            acum_conjunto = acum_conjunto + conjunto2[i];
            System.out.print(conjunto2[i]+" ");
        }
        //operacion de la suma de ambos conjuntos
        for (int ind = 0; ind < conjunto3.length; ind++) {
            conjunto3[ind]= conjunto1[ind] +conjunto2[ind];
            System.out.println("");
            System.out.print(conjunto3[ind]);
        }
       
        
    }
}
