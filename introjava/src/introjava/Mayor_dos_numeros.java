
package introjava;

import java.util.Scanner;

public class Mayor_dos_numeros {
    public static void main(String[] args) {
        Scanner datos= new Scanner(System.in);
        int num1 ;
        int num2 ;
        System.out.println("Ingrese el primer valor\n");
        num1 = datos.nextInt();
        System.out.println("Ingrese el segundo valor");
        num2 = datos.nextInt();
        if (num1 > num2) {
            System.out.println("el primer numero es el mayor");            
        }else if (num1 < num2){
            System.out.println("el segundo valor es el mayor");
        }else if (num1 == num2) {
            System.out.println("los numeros son iguales");
        }
    }
    }

