package Ejercicios_for;
import java.util.Scanner;
public class puente {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int dis_puente;
        int altura_col;
        int dis_entre_col;
        System.out.println("Ingrese la distancia del puente a procesar:");
        dis_puente = dato.nextInt();
        System.out.println("Ingrese la altura del puente a procesar:");
        altura_col = dato.nextInt();
        System.out.println("Ingrese la distancia entre columnas a procesar:");
        dis_entre_col = dato.nextInt();
        for (int fila = 0; fila <= altura_col; fila++) {
            for (int col = 1; col <= dis_puente; col++) {
                if (fila == 0) {
                    System.out.print("- ");
                } else if (col % (dis_entre_col + 1 ) == 0) {
                    System.out.print("* ");
                }else{
                System.out.print(" ");
                }                
            }
            System.out.println("");
        }
    }
}
