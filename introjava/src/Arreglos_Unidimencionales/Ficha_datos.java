package Arreglos_Unidimencionales;
import java.util.Scanner;
public class Ficha_datos {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int edad[] = new int [5];
        String nombre[] = new String[5];
        String celular[] = new String[5];
        String universidad[] = new String[5];      
        //operacion de escritura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("ingrese la edad del estudiante");
            edad[indice] = Integer.parseInt(datos.nextLine());
            System.out.println("Ingrese el nombre del estudiante");
            nombre[indice] = datos.nextLine();
            System.out.println("Ingrese la universidad del estudiante");
            universidad[indice] = datos.nextLine();
            System.out.println("Ingrese el numero telefonico del estudiante");
            celular[indice] = datos.nextLine();
        }
        //operacion de lectura
        int acum_edad = 0;
        for (int indice = 0; indice < edad.length; indice++) {
            acum_edad = acum_edad + edad[indice];
            System.out.println("======================================================");
            System.out.println("\tFICHA ESTUDIANTIL");
            System.out.println("EDAD               --->\t"+ edad[indice]);
            System.out.println("NOMBRE             --->\t"+nombre[indice]);
            System.out.println("UNIVERSIDAD        --->\t" +universidad[indice]);
            System.out.println("NUMERO TELEFONICO  --->\t" + celular[indice]);
            System.out.println("======================================================");
        }
        System.out.println("promedio de las edades" + (acum_edad / edad.length) );
    }
}
