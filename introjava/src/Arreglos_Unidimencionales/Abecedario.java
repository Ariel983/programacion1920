/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales;

/**
 *
 * @author byron
 */
public class Abecedario {

    public static void main(String[] args) {
        char abecedario[] = new char[30];
        int indice = 0;
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            //System.out.print(letra +",");
            //operacion de escritura
            abecedario[indice] = letra;
            indice++;
        }
        //operacion de lectura
        int tam = abecedario.length;//obtenemos tampa;o del arrglo
        for (int ind = 0; ind <tam; ind++) {
            if (ind == (tam - 1)) {
                System.out.println(abecedario[ind]);
            } else {
                System.out.print(abecedario[ind] + ", ");
            }
        }
    }
}
