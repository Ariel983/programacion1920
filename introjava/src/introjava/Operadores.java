/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//operadores de las distintas clases en programacion JAVA

package introjava;
public class Operadores {
    
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS
        int suma = 14+14;
        int resta = 20-10;
        double multiplicacion = 50 * 0.12;
        int div = 7%2;   
        System.out.println("OPERADORES ARITMETICOS");
        System.out.println("la suma es:"+ suma);
        System.out.println("la resta es:"+ resta);
        System.out.println("la multiplicacoin es:"+ multiplicacion);
        System.out.println("la division es:"+ div);
        
        //OPERDORES DE INCREMENTO
        System.out.println("OPERADORES DE INCREMENTO");
        int nota = 15;
        nota =nota+1;
        System.out.println("Su onta final: "+nota);
        System.out.println("/////");
        nota +=1;
        System.out.println("la nota final es:" +nota);
        System.out.println("/////");
        nota ++;
        System.out.println("la nota es:" + nota);
        
        //DECREMENTO DE LA VARIABLE
        System.out.println("DECREMENTO  ");
        nota =nota-1;
        System.out.println("el decremento es:"+ nota);
        nota -=1;
        System.out.println("el sigueinte decrementeo es:"+ nota);
        nota --;
        System.out.println("sigues bajando"+ nota);
        
        
        
    }   
}