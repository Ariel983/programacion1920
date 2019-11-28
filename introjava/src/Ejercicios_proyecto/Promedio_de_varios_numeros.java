package Ejercicios_proyecto;

import java.util.Scanner;

public class Promedio_de_varios_numeros {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int num;
        double prom = 0;
        double suma = 0;
        int cont = 0;
        boolean op = true;
        do {
            System.out.println("Desea ingresar una nota SI / NO");
            String res = datos.next();
            res = res.toLowerCase(); // toLoweCase sirve para cambiar una respuesta de minuscula a mayuscula
            if (res.equals("si")) {
                System.out.println("Ingrese la Nota:");
                num = datos.nextInt();
                cont++;
                suma = (suma + num);
                prom = suma / cont;
            } else if (res.equals("no")) {
                op = false;
            }
        } while (op == true);
        System.out.println("el promedio es es:" + prom);
    }
}
