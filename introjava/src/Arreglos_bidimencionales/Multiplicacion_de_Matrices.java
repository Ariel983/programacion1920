package Arreglos_bidimencionales;

import java.util.Scanner;

/*AUTOR:
        Ariel Sarango
 */
public class Multiplicacion_de_Matrices {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz 1");
        int fila1 = datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el numero de columnas de la matriz 1");
        int col1 = datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el numero de filas de la matriz 2");
        int fila2 = datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el numero de columnas de la matriz 2");
        int col2 = datos.nextInt();
        datos.nextLine();
        int matriz_1[][] = new int[fila1][col1];
        int matriz_2[][] = new int[fila2][col2];
        int matriz_resultante[][] = new int[fila1][col2];
        //Ingreso de datos para la matriz 1
        for (int fila = 0; fila < matriz_1.length; fila++) {
            int tam_col = matriz_1[fila].length;
            for (int col = 0; col < tam_col; col++) {
                System.out.println("Ingrese un numero");
                int num = datos.nextInt();
                matriz_1[fila][col] = num;
            }
            System.out.print("");
        }
        //Lectura de los datos de la matriz 1
        for (int fila = 0; fila < matriz_1.length; fila++) {
            int tam_col = matriz_1[fila].length;
            for (int col = 0; col < tam_col; col++) {
                System.out.print(matriz_1[fila][col] + "\t");
            }
            System.out.println("");
        }
        //ingreso de datos para la segunda matriz
        for (int fila_2 = 0; fila_2 < matriz_2.length; fila_2++) {
            int tam_col2 = matriz_2[fila_2].length;
            for (int col_2 = 0; col_2 < tam_col2; col_2++) {
                System.out.println("Ingrese los datos para la segunda matriz");
                int num2 = datos.nextInt();
                matriz_2[fila_2][col_2] = num2;
            }
            System.out.print("");
        }
        //lectura de datos de la segunda matriz
        for (int fila_2 = 0; fila_2 < matriz_2.length; fila_2++) {
            int tam_col2 = matriz_2[fila_2].length;
            for (int col_2 = 0; col_2 < tam_col2; col_2++) {
                System.out.print(matriz_2[fila_2][col_2] + "\t");
            }
            System.out.println("");
        }
        // Multiplicacion de las matrices
        for (int fil = 0; fil < fila1; fil++) {
            int tam_col = matriz_resultante[fil].length;
            for (int col = 0; col < tam_col; col++) {
                for (int ind = 0; ind < fila2; ind++) {
                    matriz_resultante[fil][col] += matriz_1[fil][ind] * matriz_2[ind][col];
                }
            }
        }
        //Lectura de la matriz resultante
        System.out.println("el resultado de la multiplicacion de las matrices es:");
        for (int fila = 0; fila < fila1; fila++) {
            int tam_col = matriz_resultante[fila].length;
            for (int col = 0; col < tam_col; col++) {
                System.out.print(matriz_resultante[fila][col] + "\t");
            }
            System.out.println("");
        }
    }
}
