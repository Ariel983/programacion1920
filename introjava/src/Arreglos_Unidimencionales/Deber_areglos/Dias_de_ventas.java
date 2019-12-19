package Arreglos_Unidimencionales.Deber_areglos;
import java.util.Scanner;
public class Dias_de_ventas {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        int dia [] = new int[3];
        int mayor_venta=0;
        int menor_venta=0;
        for (int cont = 0; cont < dia.length; cont++) {
            System.out.println("Ingrese su cantidad de venta del dia de hoy:");
            dia[cont]=datos.nextInt();
            if (dia[cont] > mayor_venta) {
                mayor_venta = dia[cont];
            }
            if (dia[cont] < menor_venta) {
                menor_venta = dia[cont];

            }
        }
        System.out.println("El mayor venta fue de: " + mayor_venta);
        System.out.println("La menor venta fue de: " + menor_venta);
    }
        }




