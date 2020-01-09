/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.Deber;

import java.util.Scanner;
/**
 *
 * @author byron
 */
public class Angulos {   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("RAZONES TRIGONOMÉTRICAS");
        System.out.println("Ingrese al angulo que desea comprobar");
        double angulo = entrada.nextInt();
        System.out.println("Escoja que razon trigonometrica desea");
        System.out.println("1. Tangente");
        System.out.println("2. Cotangente");
        System.out.println("3. Secante");
        System.out.println("4. Cosecanta");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case (1):
                System.out.println("La tangente es: " + Tangente(angulo));
                break;
            case (2):
                System.out.println("La Cotangente es: "+Cotangente(angulo));
                break;
            case (3):
                System.out.println("La Secante es: "+ Secante(angulo));
                break;
            case (4):
            System.out.println("La Cosecante es: "+ Cosecante(angulo));
                break;
            default:
        }
    }
    public static double Tangente(double angulo) {
        double tangente = Math.sin(angulo) / Math.cos(angulo);
        return tangente;
    }
    public static double Cotangente(double angulo) {
        double cotangente = Math.cos(angulo) / Math.sin(angulo);
        return cotangente;
    }
    public static double Secante(double angulo) {
        double secante = 1 / Math.cos(angulo);
        return secante;
    }
    public static double Cosecante(double angulo) {
        double cosecante = 1 / Math.sin(angulo);
        return cosecante;
    }
}

