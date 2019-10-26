/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author byron
 */
public class Entrada_Datos {
    public static void main(String[] args) {
        //SUMAR DOS NUMEORS
        //
        Scanner teclado = new Scanner (System.in);
        /*System.out.println("Ingrese un nombre");
        String mi_nombre = teclado.nextLine();
        System.out.println("su nombre es: "+mi_nombre);
        
        System.out.println("Ingrese su nombre");
        String mi_nombre1 = teclado.nextLine();
        System.out.println("Ingrese su nombre:"+mi_nombre1);*/
        
        System.out.println("Ingresa su ceedula:");
        char letra = teclado.nextLine().charAt(8);
        System.out.println("La letra ingresada es: "+letra);
        
        /*
        Scanner teclado = new Scanner (System.in);
        int suma;
        System.out.print("Ingrese el valor para el primer numero:");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el valor para el segundo numero:");
        int num2 = teclado.nextInt();
        suma = num1 + num2;
        System.out.println("La suma es:"+suma);*/
        
    }
}
