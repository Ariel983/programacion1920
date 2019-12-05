package Ejercicios_while;

import java.util.Scanner;

public class Numeros_Primo {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        //System.out.println("Ingrese un numero: ");
        int cont_num = 2;
        int cont_primos = 0;
        while (cont_primos <10) {

            int num = cont_num;
            int acum = 0;
            int cont = num;
            while (cont >= 1) {
                if (num % cont == 0) {
                    acum++;
                }
                cont--;
            }
            if (acum == 2) {
                System.out.print(" "+num+",");
                cont_primos++;
            }
            cont_num++;
        }
    }
}
