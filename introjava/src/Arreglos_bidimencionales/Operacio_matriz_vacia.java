
package Arreglos_bidimencionales;

import java.util.Scanner;

/*AUTOR
    Ariel Sarango
 */
public class Operacio_matriz_vacia {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        int fila=datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = datos.nextInt();
        datos.nextLine();
        String nombres[][] = new String[fila][columnas];
        //vamos a ingresar elementos a la matriz
        //escritura de los elementos de la matriz
        for (int filas = 0; filas < nombres.length; filas++) {
            int tam_col = nombres[filas].length;//tama;o de las columnas
            for (int col = 0; col < tam_col; col++) {
                System.out.println("Ingrese un valor");
                String valor =  datos.nextLine();
                nombres[filas][col] = valor;
            }
            System.out.println("");
        }
        //vamos a recorres la matriz
        //lectura de los elemnetos de la matriz
        for (int filas = 0; filas < nombres.length; filas++) {
            int tam_col = nombres[filas].length;//tama;o de las columnas
            for (int col = 0; col < tam_col; col++) {
                System.out.print(nombres[filas][col] + "\t");
            }
            System.out.println("");
        }
    }
}
