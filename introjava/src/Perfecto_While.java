/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author byron
 */
public class Perfecto_While {

    public static void main(String[] args) {
        int i = 1, cont = 0, suma = 1, suma_div = 0, num = 1;
        while (cont < 4) {
            while (i < num) {
                if (num % i == 0) {
                    suma_div++;
                } else {
                    i++;
                    if (suma_div == num) {
                        System.out.println("el numero perfecto es: " + num);
                        cont = cont + 1;
                    } else {
                        suma_div = 0;
                        i = 1;
                        num = num + 1;
                    }
                }
            }
        }

    }
}
