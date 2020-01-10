package Arreglos_Unidimencionales.Deber_areglos;
import java.util.Scanner;
/*AUTOR:
        Ariel Sarango
 */
public class Numero_binario {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        long num, cociente;
        String binario = "";
        System.out.println("Convertir decimal a binario");
        System.out.println("---------------------------\n");
        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = datos.nextLong();
            if (num <= 0) {
                System.out.println("\n¡Debe ingresar un entero positivo!\n");
            }
        } while (num <= 0);
        cociente = num;
        while (cociente > 1) {
            binario = (cociente % 2) + binario;
            cociente = cociente / 2;                //División entera
        }
        binario = cociente + binario;
        System.out.println("\nEl número " + num
                + " representado en el sistema binario es " + binario);

    }
}
