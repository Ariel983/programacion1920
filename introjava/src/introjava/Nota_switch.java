package introjava;
import java.util.Scanner;
public class Nota_switch {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("NOTA DE UN ESTUDUANTE MEDIANTE LA SENTENCIA SWITCH");
        int nota;
        System.out.println("Ingrese su nota");
        nota= datos.nextInt();
        switch(nota){
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Insuficiente");
                break;
            case 5: case 6:
                System.out.println("Suficiente");
                break;
            case 7: case 8:
                System.out.println("Bien");
                break;
            case 9: case 10:
                System.out.println("Notable");
                break;
            default:
                System.out.println("Ingrese una nota entre 0 y 10");
        }
        }
    }

