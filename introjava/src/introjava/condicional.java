
package introjava;
import java.util.Scanner;
public class condicional {
    public static void main(String[] args) {
        System.out.println("pragama para calcular si una persona es mayor de edad.");
        Scanner dato = new Scanner (System.in);
        System.out.println("INGRESE SU EDAD");
        int edad = dato.nextInt();
        if (edad >= 18) { 
            System.out.println("Eres mayor de edad. Tienes\t" + edad + "  Años");            
        }else{
            System.out.println("Eres menor de edad.Tienes\t" + edad + "  Años");
        }
        
    }
}
