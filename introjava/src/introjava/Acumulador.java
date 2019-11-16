/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author byron
 */
public class Acumulador {
    public static void main(String[] args) {
        System.out.println("Probando con acumulador");
        int cont =1;
        int acum = 1;//va ha acumular la suma de los numeros del 1 al 5
        while(cont <= 5){
            acum = acum * cont;
            cont ++;
        }
        System.out.println("el valor del contador " + cont);
        System.out.println("valor del acumulador " + acum);
    }
}
