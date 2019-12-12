/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Unidimencionales;

/**
 *
 * @author byron
 */
public class Ejemplos {
    public static void main(String[] args) {
        String universidades [] = {"UTPL","UNL","U.CUENCA"};
        String estudiantes [] = new String[20];
        int num [] = new int[10];
        num[3] = 2;
        //System.out.println(universidades[1]);
        estudiantes[0] = "inicio";
        estudiantes[10] = "Ariel";
        for (int i = 0; i <universidades.length; i++) {
            System.out.println(universidades[i]);
        }
        for (int i = 0; i <estudiantes.length; i++) {
            System.out.println("Estudaintes["+i+"] - " +estudiantes[i]);
            
        }
    }
}
