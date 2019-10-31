//CALCULAR EL COSTO DE UN PEDIDO
package introjava;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double precio_unidad;
        double precio;
        double des;
        int cantidad;
        String producto ;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el producto");
        producto = dato.nextLine();
        System.out.println("Ingrese la cantidad de pedidos a realizar:");
        cantidad = dato.nextInt();
        System.out.println("Ingrese el precio por unidad ");
        precio_unidad= dato.nextDouble();
        precio = cantidad * precio_unidad;
        System.out.println("El precio del articulo: " + precio_unidad);  
        if(cantidad >= 50){
            des = precio * 0.15;
            System.out.println("El precio con descuento es"+ des);
        }  
        if (precio < 1){
                System.out.println("es\t" + precio +"centavos");
        }else{
            System.out.println("precio normal es\t"+precio + "Dolares");
        }
        }       
}