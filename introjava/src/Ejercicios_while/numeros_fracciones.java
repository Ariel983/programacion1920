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
public class numeros_fracciones {
    public static void main(String[] args) {
       Scanner datos = new Scanner(System.in);
        int num;
        int cont =1;
        String res = "";
        String nume = "";      
        System.out.println("Ingrese un numero");
        num= datos.nextInt();
        while(cont <= num){
            res += nume +"1/"+cont+"\t"  ;
            if (cont == 1) {
              nume="+\t";
            }
            cont ++;
        }
        System.out.println(" "+res);
    }
}
