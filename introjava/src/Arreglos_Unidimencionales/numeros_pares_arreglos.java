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
public class numeros_pares_arreglos {

    public static void main(String[] args) {
        int par, cont = 1;
        int numeros_pares[] = new int[20];
        
       //generar los 20 primeros numeros pares
       
        for (int indice = 0; indice < numeros_pares.length; indice++) {
           while (cont <= 40) {
            if (cont % 2 == 0) {
                par = cont;
                //guardamos lo numeros pares en el arreglo
                numeros_pares[indice] = par;
                //se presentan los valores que estan en el arreglo
                System.out.print(" "+numeros_pares[indice]);
            }
            cont++;
        }
        // 
        }
    }
}
