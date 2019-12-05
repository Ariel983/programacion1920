package Ejercicios_proyecto;

public class Numeros_Perfectos {
    public static void main(String[] args) {
        int i=0;
        int j = 0;
        int sum;
        int max = 10000;// este es el limite hasta donde puede buscar el programa numeros perfectos   
        System.out.println("   NUMEROS PERFECTOS");
        System.out.println("======================");
        while (i <= max) {
            i++;
            for (i = 1; i <= max; i++) {
                sum = 0;
                for (j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum = sum + j;
                    }
                }
                if (i == sum) {
                    System.out.println("\t" + j);
                    System.out.println("======================");
                }
            }
        }
    }
}
