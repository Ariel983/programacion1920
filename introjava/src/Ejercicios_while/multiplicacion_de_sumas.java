/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

import java.util.Scanner;

public class multiplicacion_de_sumas {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int num1;
        int num2;
        int cont = 1;
        int cons = 0;
        System.out.println("Ingrese el primer numero");
        num1 = datos.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = datos.nextInt();
        
        System.out.println("=============================");
        System.out.println("Las veces que se sumaran son:");
        while(cont <= num1){
            cons = cons+num2;
            System.out.println(""+cont);
            cont++;   
        }
        System.out.println("=============================");
        System.out.println("la suma es "+cons);
    }
}
