
package introjava;

public class suma_de_pares {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA SUMAR LOS PARES DE 1 AL 100");
        int cont = 1;
        int par;
        int acum =0;
        int suma;
        while(cont <= 100 ){
            if (cont % 2 == 0) {
                par =cont;
                System.out.println(""+par);
                acum=acum+par;               
            } 
            cont++;
        }
        System.out.println("la suma es;"+acum);
               
    }
}
