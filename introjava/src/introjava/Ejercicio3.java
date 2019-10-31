//CALCULAR LOS VALORES DE "X" y "Y"
package introjava;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        double x;
        double y ;
        Scanner dato= new Scanner(System.in);
        System.out.println("Ingresar un valor para X");
        x =dato.nextInt();
        if(x<0){
            y = (3*x)+6 ;
            System.out.println("el valor de Y es:"+y);
        }else{
            if(x>=0){
                y = (Math.pow(x,2))+6; 
                System.out.println("El valor de Y es:"+y);
            }
        }
    }    
}
