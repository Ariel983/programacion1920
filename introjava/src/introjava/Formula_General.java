package introjava;
//LIBRERIAS QUE SE UTILIZAN EN EL PROGRAMA
//Autor --> Ariel Sarango
import java.util.Scanner;

public class Formula_General {

    /*Realize un programa que atraves de la formula general resuelva la ecuacion
    cuadratica. El programa debe mostrar en pantalla dos respuestas x1 y x2*/
    public static void main(String[] args) {
        System.out.println("\t RESOLUCION DE ECUACIONES ATRAVES DE LA FORMULA GENERAL");
        double a, b, c;
        double x_pos, x_neg;
        double cont; // esto guardara el valor encontrado dentro de la raiz de la formula
        Scanner dato = new Scanner(System.in);
        System.out.println("INGRESE UN VALOR PARA A");
        a = dato.nextInt();
        System.out.println("INGRESE UN VALOR PARA B");
        b = dato.nextInt();
        System.out.println("INGRESE UN VALOR PARA C");
        c = dato.nextInt();
        cont = Math.pow(b, 2) - 4 * a * c;
        if (cont < 0) {
            System.out.println("\t La solucion no es real.");
        } else {
            x_pos = (-b + Math.sqrt(cont)) / 2 * a;//en esta parte calculamos la formula ya antes evaluado 
            x_neg = (-b - Math.sqrt(cont)) / 2 * a;// 
            System.out.println("La solucion de x1 es:" + x_pos);
            System.out.println("La solucion de x2 es:" + x_neg);
        }

    }
}
