
package introjava;

public class Numero_mayorV2 {
    public static void main(String[] args) {
        int n1 = 20, n2=20,n3=10;
        if (n1 > n2) {
            if (n1 >n3) {
                System.out.println("el numero mayor es:" +n1);
            }else{
                System.out.println("el numero mayor es:" +n3);
            }
        }else{
            if (n2>n3) {
                System.out.println("el numero mayor es:" + n2);
            }else{
                System.out.println("el numero mayor es:" + n3);
            }
        }
    }
}
       