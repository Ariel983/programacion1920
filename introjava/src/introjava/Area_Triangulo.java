
package introjava;
import java.util.Scanner;

public class Area_Triangulo {
    public static void main(String[] args) {
        double base;
        double area;
        double altura;   
        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese un valor para la base:");
        base = datos.nextDouble();
        System.out.println("Ingrese un valor para la altura:");
        altura = datos.nextDouble();
        area = (base * altura)/2;
        System.out.println("El area del triangulo es:"+area);                                
    }        
}
