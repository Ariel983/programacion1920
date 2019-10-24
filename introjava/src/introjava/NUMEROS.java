/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;

public class NUMEROS {
    public static void main(String[] args) {
    
        Scanner num = new Scanner (System.in);
        System.out.println("Ingresar dos numeros enteros y realizar las operaciones:");    
       int num1;
       int num2 ;
       int suma;
       int resta;
       int mult;
       double div;
       int mod;
        System.out.println("Ingrese un numero para el primer numero:");
        num1=num.nextInt();
        System.out.println("Ingrese un numero para el segundo numero:");
        num2=num.nextInt();
        suma = num1+ num2;
        System.out.println("La suma de los numeros es:"+suma);
        resta = num1 - num2;
        System.out.println("La resta de los numeros es:"+resta);
        mult = num1 * num2;
        System.out.println("La multiplicacion de los numeros es:"+mult);
        div = (double)num1 / num2;
        System.out.println("La division de los numeros es:"+div);
        mod = num1 / num2;
        System.out.println("El modulo de los numeros es:"+mod);
      
        //operaciones de numeros
        /* int suma = num1 + num2;
        System.out.println("La suma es:"+ suma);
       int resta = num1 - num2;
        System.out.println("La resta es:"+ resta);
       int mult = num1 * num2;
        System.out.println("La multiplicacion es:"+ mult);
       int div = num1 % num2;
        System.out.println("la division es:"+ div);  
        int mod = num1 / num2;
        System.out.println("el modulo es:"+mod);*/
      
      
      
    }
}
