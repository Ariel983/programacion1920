
package introjava;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        double nota;
        System.out.println("Ingrese la nota del estuduante");
        nota= datos.nextDouble();
        if (nota  > 0 && nota <= 10) {
            if (nota > 0 && nota <= 4) {
                System.out.println("Insufuciente");
            } else if (nota >= 5 && nota <=6) {
                System.out.println("Suficiente");
            }else if (nota >=7 && nota <= 8) {
                System.out.println("Bien");
            }else if (nota >= 9 && nota <=10) {
                System.out.println("Notable");
            }
        }else{
            System.out.println("ingrese un valor entre 0 y 10");
        }
    }
}
