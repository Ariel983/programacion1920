//CALCULAR EL PRECIO DE UN TERRENO
package introjava;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {        
        double precio;
        double largo;
        double ancho;
        double area;
        double precio_total;
        System.out.println("Ingresar el largo del terreno: ");
        Scanner entrada = new Scanner(System.in);
        largo = entrada.nextDouble();
        System.out.println("Ingresar el ancho del terreno: ");
        Scanner entrada1 = new Scanner(System.in);
        ancho = entrada.nextDouble();
        System.out.println("Ingresar el precio por m2; ");
        Scanner entrada2 = new Scanner(System.in);
        precio_total = entrada.nextDouble();
        System.out.println("El largo del terreno es: " + largo);
        System.out.println("El ancho del terreno es: " + ancho);
        System.out.println("El costo por metros cuadrados:" + precio_total);
        area = ancho * largo;
        precio = area * precio_total;
        if (area > 400) {
            precio_total = (precio - (precio * 0.10));
            System.out.println("Total a pagar con descuento;" + precio_total);
        } else {
            System.out.println("Total a pagar: " + precio);                 
        } 
   }

}