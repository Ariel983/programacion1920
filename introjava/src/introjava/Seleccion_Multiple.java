
package introjava;

import java.util.Scanner;

public class Seleccion_Multiple {
    public static void main(String[] args) {
        System.out.println("EMPLEO DE LA SENTENCIA SWITCH");
        System.out.println("PROGRAMA PARA DETERMINAR SI UN CARACTER"
                          +"INGRESADO POR TECLADO ES UNA VOCAL");
        Scanner dato = new Scanner(System.in);
        char letra = dato.next().charAt(0);
        switch(letra){
            case 'a':  case 'e': case 'i': case 'o': case 'u': 
                System.out.println("Es una vocal:\n"+letra);
                break;
            case 'A':  case 'E': case 'I': case 'O': case 'U': 
                System.out.println("Es una vocal:\n"+letra);
                break;
            default:
                System.out.println("No es una vocal"); 
        }
    }
}