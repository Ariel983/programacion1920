/*INTEGRANTES
        Luis Sarango
        Diego Leiva
        Ariel Cruz
 */
package Metodos;

import java.util.Scanner;

public class Dado_un_Numero_Presenta_mes {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = datos.nextInt();
       // mes(num); // ---> para cundo el metodo no retorna un numero
        String mes = mes_v2(num); // ---> cuando el metodo retorna un valor
        System.out.println(mes);
    }

    /**
     * metodo cuando no retorna valores
     *
     * @param num es el numeor del mes
     */
    public static void mes(int num) {
        if (num == 1) {
            System.out.println("ENERO");
        } else if (num == 2) {
            System.out.println("FEBRERO");
        } else if (num == 3) {
            System.out.println("MARZO");
        } else if (num == 4) {
            System.out.println("ABRIL");
        } else if (num == 5) {
            System.out.println("MAYO");
        } else if (num == 6) {
            System.out.println("JUNIO");
        } else if (num == 7) {
            System.out.println("JULIO");
        } else if (num == 8) {
            System.out.println("AGOSTO");
        } else if (num == 9) {
            System.out.println("SEPTIEMBRE");
        } else if (num == 10) {
            System.out.println("OCTUBRE");
        } else if (num == 11) {
            System.out.println("NOVIEMBRE");
        } else if (num == 12) {
            System.out.println("DICIENMRE");
        } else if (num > 12 || num < 1) {
            System.out.println("ERROR");
        }
    }
   /**
    * Metodo cunado retorna los valores
    * @param num es el numero el cual vamos a encontrar su me mes en letras.
    * @return 
    */
    public static String mes_v2(int num) {
        String msg = "";
        if (num == 1) {
            msg ="ENERO";
        } else if (num == 2) {
            msg ="FEBRERO";
        } else if (num == 3) {
            msg ="MARZO";
        } else if (num == 4) {
            msg ="ABRIL";
        } else if (num == 5) {
            msg ="MAYO";
        } else if (num == 6) {
            msg ="JUNIO";
        } else if (num == 7) {
            msg ="JULIO";
        } else if (num == 8) {
            msg ="AGOSTO";
        } else if (num == 9) {
           msg ="SEPTIEMBRE";
        } else if (num == 10) {
            msg ="OCTUBRE";
        } else if (num == 11) {
            msg ="NOVIEMBRE";
        } else if (num == 12) {
            msg ="DICIENMRE";
        } else if (num > 12 || num < 1) {
            msg ="ERROR";
        }
        return msg;
    }
}
