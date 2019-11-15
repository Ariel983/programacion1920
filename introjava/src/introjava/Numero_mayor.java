
package introjava;
import java.util.Scanner;
public class Numero_mayor {
     
     public static void main(String[] args) {
         Scanner dato = new Scanner (System.in);
         int num1,num2,num3;
         System.out.println("ingrese el primer valor");
         num1 = dato.nextInt();
         System.out.println("ingrese el segundo valor");
         num2 = dato.nextInt();
         System.out.println("ingrese el tercer valor");
         num3 = dato.nextInt();
         if (num1 >= num2 && num1 >=num3) {
             System.out.println("el numero mayor es:" +num1);
         }else if(num2 >= num1 && num2 >= num3){
             System.out.println("el numero mayor es:"+num2);
         }else if (num3 >= num1 && num3 >=num2) {
             System.out.println("el numero mayor es:"+num3);
         }else {
             System.out.println("los numeros son iguales");
         }
    }
}
