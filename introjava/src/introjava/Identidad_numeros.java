
package introjava;

import java.util.Scanner;

public class Identidad_numeros {
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        int num1 ;
        int num2 ;
        System.out.println("Ingrese el primer valor\n");
        num1 = datos.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = datos.nextInt();
        if (num1 == num2) {
            System.out.println("Los numeors son iguales");            
        }else{
            System.out.println("Los numeros no son iguales");
        }
    }
}
