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
public class TablaOr {
    public static void main(String[] args) {
        System.out.println("X  \t Y    \t  respuesta");
        System.out.println("V   \t V    \t"+ (true || true));
        System.out.println("V   \t F    \t"+ (true || false));
        System.out.println("F   \t V    \t"+ (false || true));
        System.out.println("F   \t F    \t"+ (false || false));
        
        
        //TABLA DE VERDAD DEL NOT
           System.out.println("TABLA DE VERDAD DEL NOT");
           System.out.println("x      resultado");
           System.out.println(true + "\t" + !true);
           System.out.println(false + "\t" + !false);
    }
}
