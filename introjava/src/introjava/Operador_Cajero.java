package introjava;
import java.util.Scanner;
public class Operador_Cajero {
    public static void main(String[] args) {
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("Digite 1 para realizar un retiro");
        System.out.println("Digite 2 para realizar un deposito");
        System.out.println("Digite 3 para realizar una consulta");
        System.out.println("Digite 0 si no quiere hacer nada");
       
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese su saldo");
        int saldo = dato.nextInt();
        System.out.println("Ingeres la opcion elejida");
        int opcion = dato.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Opcion para realizar un retiro");
                System.out.println("Ingrese el valor a retirar");
                int retiro=dato.nextInt();
                if (retiro <= saldo) {
                    saldo = saldo -retiro;
                }else{
                    System.out.println("FONDOS INSUFICIENTES");
                }
                break;
            case 2:
                System.out.println("opcion para realizar un deposito");
                System.out.println("Ingrese el saldo del deposito");
                int deposito = dato.nextInt();
                if (deposito > 0) {
                    saldo = saldo + deposito;
                }else{
                    System.out.println("Esta intentando depositar un valor negativo");
                }
            break;
            case 3:
                System.out.println("Saldo de la cuenta");
                System.out.println("Tu saldo es:"+ saldo + "&");
            break;
            case 0:
                System.out.println("QUE TENGA UN LINDO DIA");
            break;
            default:
                System.out.println("La opcion no es valida");
        }
        System.out.println("el saldo actual es de:"+saldo + "$");
    }
}


