
package Metodos.Deber;

import java.util.Scanner;

/*AUTOR
        Ariel Sarango
 */
public class Menu_de_Operaciones {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("\t SELECCIONE SU OPCION");
        System.out.println("1 ---> Multiplicar");
        System.out.println("2 ---> Dividir");
        System.out.println("3 ---> Sumar");
        System.out.println("4 ---> Restar");
        System.out.println("================================");
        System.out.println("Escriba su opcion:");
        int num = datos.nextInt();
        operaciones(num);

    }
    /**
     * 
     * @param op es la opcion para determinar si quiere sumar, restar, multiplicar, o dividir
     */    
    public static void operaciones(int op) {
        Scanner datos = new Scanner(System.in);
        int op_2;
        boolean salir = false;
        do {
            switch (op) {
                case 1:
                    System.out.println("\tMULTIPLICACION");
                    System.out.println("================================");
                    System.out.println("Eliga la opcion que desea operar:");
                    System.out.println("1 --> MULT.\t 1");
                    System.out.println("2 --> MULT.\t 2");
                    System.out.println("================================");
                    op_2 = datos.nextInt();
                    switch (op_2) {
                        case 1:
                            System.out.println("\tMULTIPLICACION DEL 1");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("1" + "*" + cont + "=" + (1*cont));

                            }
                            break;
                        case 2:
                            System.out.println("MULTIPLICACION DEL 2");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("2" + "*" + cont + "=" + (2*cont));

                            }
                            break;
                        case 3:
                            salir = true;                           
                    }
                    break;
                case 2:
                     System.out.println("DIVIDIR");
                    double res=0.0;
                    System.out.println("Eliga la opcion que desea operar:");
                    System.out.println("1 --> DIV.\t 1");
                    System.out.println("2 --> DIV.\t 2");
                    op_2 = datos.nextInt();
                    switch (op_2) {
                        case 1:
                            System.out.println("Divicion del 1");
                            
                            for (int cont=  1; cont < 10; cont++) {
                            res = 1 /cont;
                                System.out.println("1" + "/" + cont +"=" +res);
                            }
                            break;
                        case 2:
                           System.out.println("Divicion del 2");
                            
                            for (int cont=  1; cont < 10; cont++) {
                            res = 1 /cont;
                                System.out.println("2" + "/" + cont +"=" +res);
                            }
                            break;
                        case 3:
                            salir = true;                           
                    }
                    break;
                case 3:
                     System.out.println("\tSUMA");
                    System.out.println("Eliga la opcion que desea operar:");
                    System.out.println("1 --> SUM.\t 1");
                    System.out.println("2 --> SUM.\t 2");
                    op_2 = datos.nextInt();
                    switch (op_2) {
                        case 1:
                            System.out.println("\tSUMA DEL 1");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("1" + "+" + cont + "=" + (1+cont));

                            }
                            break;
                        case 2:
                            System.out.println("\tSUMA DEL 2");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("2" + "+" + cont + "=" + (2*cont));

                            }
                            break;
                        case 3:
                            salir = true;                           
                    }
                    break;
                case 4:
                     System.out.println("RESTAS");
                    System.out.println("Eliga la opcion que desea operar:");
                    System.out.println("1 --> RES.\t 1");
                    System.out.println("2 --> RES.\t 2");
                    op_2 = datos.nextInt();
                    switch (op_2) {
                        case 1:
                            System.out.println("RESTA DEL 1");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("1" + "-" + cont + "=" + (1-cont));

                            }
                            break;
                        case 2:
                            System.out.println("RESTA DEL 2");
                            for (int cont = 1; cont < 11; cont++) {

                                System.out.println("2" + "-" + cont + "=" + (2-cont));

                            }
                            break;
                        case 3:
                            salir = true;                           
                    }
                    break;
                case 5:
                    salir = true;

            }
        } while (op < 1 || op > 5);
    }
}
