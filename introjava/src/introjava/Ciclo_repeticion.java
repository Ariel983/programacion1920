package introjava;
import java.util.Scanner;
public class Ciclo_repeticion {
    //TABLA DE MULTIPLICAR
    public static void main(String[] args) {
        System.out.println("Generacion de tabla de multiplicar");
        System.out.println("Ingrese unnumero para generar la tabla de multiplicar");
        Scanner datos = new Scanner(System.in);
        int numero=datos.nextInt();
        int cont=1;
        while(cont<=10){
            System.out.println(numero+" *  "+cont+"  = "+(numero*cont));
            cont++;
        }
    }
}
