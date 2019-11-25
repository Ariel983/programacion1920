// INTEGRANTES:
//          Luis Sarango
//          Jhonatan Guallo 
//          Ariel Sarango
package introjava;

import java.util.Scanner;

public class cajero_auntomatico_while {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("Digite 1 para realizar un retiro");
        System.out.println("Digite 2 para realizar un deposito");
        System.out.println("Digite 3 para realizar una consulta");
        System.out.println("Digite 0 si no quiere hacer nada");
        Scanner dato = new Scanner(System.in);
        int saldo = 1200;
        System.out.println("Ingeres opcion elejida");
        int opcion = dato.nextInt();
        boolean op = true;
        while (op == true) {
            ////////////////////////////////////////
            switch (opcion) {
                case 1:
                    System.out.println("Opcion para realizar un retiro");
                    System.out.println("Ingrese el valor a retirar");
                    int retiro = dato.nextInt();
                    if (retiro <= saldo) {
                        saldo = saldo - retiro;
                    } else {
                        System.out.println("FONDOS INSUFICIENTES");
                    }
                    System.out.println("el saldo actual es de:" + saldo + "$");
                    System.out.println("Desea realizar otra operacion si/no");
                    String res = datos.next();
                    res = res.toLowerCase();
                    if (res.equals("si")) {
                        System.out.println("Ingeres opcion elejida");
                        opcion = dato.nextInt();
                    } else if (res.equals("no")) {
                        System.out.println("QUE TENGA UN LUNDO DIA ");
                        op = false;
                    }
                    break;
                case 2:
                    System.out.println("opcion para realizar un deposito");
                    System.out.println("Ingrese el saldo del deposito");
                    int deposito = dato.nextInt();
                    if (deposito > 0) {
                        saldo = saldo + deposito;
                    } else {
                        System.out.println("Esta intentando depositar un valor negativo");
                    }
                   // System.out.println("el saldo actual es de:" + saldo + "$");
                    System.out.println("Desea realizar otra operacion si/no");
                    res = datos.next();
                    res = res.toLowerCase();
                    if (res.equals("si")) {
                        System.out.println("Ingeres opcion elejida");
                        opcion = dato.nextInt();
                    } else if (res.equals("no")) {
                        System.out.println("QUE TENGA UN LUNDO DIA ");
                        op = false;                       
                    }
                    break;
                case 3:
                    System.out.println("Saldo de la cuenta");
                    //System.out.println("Tu saldo es:" + saldo + "&");
                    System.out.println("Desea realizar otra operacion si/no");
                    res = datos.next();
                    res = res.toLowerCase();
                    if (res.equals("si")) {
                        System.out.println("Ingeres opcion elejida");
                        opcion = dato.nextInt();
                    } else if (res.equals("no")) {
                        System.out.println("QUE TENGA UN LUNDO DIA ");
                        op = false;              
                    }
                    break;
                case 0:
                    System.out.println("su saldo es de" + saldo);
                    System.out.println("Desea realizar otra operacion si/no");
                    res = datos.next();
                    res = res.toLowerCase();
                    if (res.equals("si")) {
                        System.out.println("Ingeres opcion elejida");
                        opcion = dato.nextInt();
                    } else if (res.equals("no")) {
                        System.out.println("QUE TENGA UN LUNDO DIA ");
                        op = false;                      
                    }
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    System.out.println("Desea realizar otra operacion si/no");
                    res = datos.next();
                    res = res.toLowerCase();
                    if (res.equals("si")) {
                        System.out.println("Ingeres opcion elejida");
                        opcion = dato.nextInt();
                    } else if (res.equals("no")) {
                         System.out.println("QUE TENGA UN LUNDO DIA ");
                        op = false;    
                    }
            }
            System.out.println("el saldo actual es de:" + saldo + "$");
        }
        ////////////////////////////////////////////////////////////////////////
    }

}
