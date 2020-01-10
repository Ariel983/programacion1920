/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales.Deber_areglos;

import java.util.Scanner;

/*AUTOR
        Ariel Sarango
 */
public class Cedula_Comprobante {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int aux;
        int cedula[] = new int[10];

        while (i < 9) {
            System.out.println("digito " + (i + 1) + " de la cedula");
            cedula[i] = datos.nextInt();
            aux = cedula[i] * 2;
            if (aux <= 10) {
                suma = suma + aux;
            } else {
                aux = aux - 9;
                suma = suma + aux;
            }
            i = i + 1;

            if (i < 9) {
                System.out.println("digito " + (i + 1) + " de la cedula");
                cedula[i] = datos.nextInt();
                aux = cedula[i] * 1;
                suma = suma + aux;
                i = i + 1;
            }
        }

        System.out.println("digito " + (i + 1) + " de la cedula");
        System.out.println(suma);
        cedula[i] = datos.nextInt();
        if (suma < 11 || suma < 20) {
            suma = 20 - suma;
            System.out.println("1");
        } else {
            if (suma < 21 || suma < 30) {
                suma = 30 - suma;
                System.out.println("2");
            } else {
                if (suma < 31 || suma < 40) {
                    suma = 40 - suma;
                    System.out.println("3");
                    System.out.println(suma);
                } else {
                    if (suma < 41 || suma < 50) {
                        suma = 50 - suma;
                        System.out.println("4");
                    } else {
                        if (suma < 51 || suma < 60) {
                            suma = 60 - suma;
                            System.out.println("5");
                        }
                    }
                }
            }
        }

        if (suma == cedula[i]) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
            System.out.println("El numero erromeo es " + suma);;
        }
    }
}
