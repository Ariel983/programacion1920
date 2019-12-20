package Arreglos_bidimencionales;
/*AUTOR
    Ariel Sarango
 */
public class Intro {
    //Declaracion de matrices conocidos
    public static void main(String[] args) {
        String nombres[][] = {
            {"Ariel", "Alex", "Dodi", "Mario", "Luiz"},
            {"Genesis", "Diego", "Anthony", "Isaias", "Jhonatan"}
        };
        //System.out.println(nombres[0][2]);
        //System.out.println(nombres[1][4]);
        System.out.println(nombres.length);
        //recorrer la matriz
        for (int fila = 0; fila <5; fila++) { //recorriendo las filas
            //int tam_col = nombres[fila].length;//obtenemos el numero de las columnas de la fila
            //vamos a recorrer ca uno de los elementos de la fila
            for (int col = 0; col <2; col++) {
                System.out.print("\t" + nombres[col][fila]);
            }
            System.out.println("");
        }
    }
}
