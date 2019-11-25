/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Auntentificacion {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        System.out.println("AUTENTIFICACION");
        String user = "Ariel";
        String password = "12345";
        boolean autentificacion = false;
        while(!autentificacion){
            System.out.println("Ingrese su usuario");
            String usuario = datos.next();
            System.out.println("Ingrese su clave");
            String pass = datos.next();
            if (user.equals(usuario) && password.equals(pass)) {
                System.out.println("BIENVENIDO AL SISTEMA");
                autentificacion = true;
            }else{
                System.out.println("ERROR");
            }
        }
    }
    
    
    
}
