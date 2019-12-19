package Arreglos_Unidimencionales.Deber_areglos;

import java.util.Scanner;
/*AUTOR
    Ariel Sarango

 */
public class Imprimir_mayor_menor {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int numeros[] = new int[4];
        int acu =0;
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Ingrese un numero");
            numeros[indice] = datos.nextInt();
        }
        //recorrer el arreglo y ordenar de mayor a menor
        for (int indice=  0; indice < numeros.length; indice++) {
            for (int ind = indice + 1; ind < numeros.length; ind++) {
                if (numeros[indice] < numeros[ind]) {
                    acu = numeros[indice];
                    numeros[indice] = numeros[ind];
                    numeros[ind] = acu;
                }
            }
            System.out.println("--> " +numeros[indice]);          
        }
    }
}
            
       
