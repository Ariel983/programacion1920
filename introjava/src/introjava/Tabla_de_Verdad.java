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
public class Tabla_de_Verdad {
    public static void main(String[] args) {
        System.out.println("Es una tabla de verdad del operador AND");
        System.out.println("________________________________________________");
        System.out.println("X   \t    Y \t RESULTADO");
        System.out.println("________________________________________________");
        System.out.println("V \t    V \t "  + "  " + (true && true));
        System.out.println("________________________________________________");
        System.out.println("V \t    Y \t "  + "  " + (true && false));
        System.out.println("________________________________________________");
        System.out.println("Y \t    V \t "  + "  " + (false && true));
        System.out.println("________________________________________________");
        System.out.println("Y \t    Y \t "  + "  " + (false && false));
        System.out.println("________________________________________________");
        
    }
}
