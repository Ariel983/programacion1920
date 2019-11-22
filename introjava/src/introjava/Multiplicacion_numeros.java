package introjava;
import java.util.Scanner;
public class Multiplicacion_numeros {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Programa para multiplicacr n numeors");
        int num;
        int acum = 1;
        boolean op = true;
        System.out.println("ingrese un numero:");
        num = datos.nextInt();
        acum=acum*num;
        while (op == true) {
            System.out.println("Desea ingresar un nuevo numero si/no");
            String res = datos.next();
            res = res.toLowerCase(); // toLoweCase sirve para cambiar una respuesta de minuscula a mayuscula
            if (res.equals("si")) {
                System.out.println("Ingrese su nuevo numero:");
                num = datos.nextInt();
                acum=acum*num;
            } else if (res.equals("no")) {
                op = false;
            }
        }
        System.out.println("la multiplicacion es:"+acum);
    }
}
