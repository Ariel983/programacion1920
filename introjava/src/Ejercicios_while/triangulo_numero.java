/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class triangulo_numero {
    public static void main(String[] args) {
        Scanner datos= new Scanner (System.in);
        int num;
        int cont = 1;
        String bs ="";
        System.out.println("Ingrese un numero");
        num = datos.nextInt();
        System.out.println("============================");
        while(cont <= num){
            bs += cont+"\t";
            System.out.println(" "+bs);
            cont++;
        }
               
    }
   
}
