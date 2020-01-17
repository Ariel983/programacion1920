/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/*AUTOR
        Ariel Sarango
 */
public class Ambito_Variables {
    //creacion de variables globales
    int sueldo_basico = 400;
    double aporte_IES = 0.09;
   
    /**
     * calcula el aporte al IES de un trabajador.
     * @return aporte 
     */
    public  double Calcular_Aporte_IES() {
        double aporte = sueldo_basico * aporte_IES ;     
        return aporte;
    }
    /**
     * Metodo para calcular cuanto se va ha depositar al trabajador
     * @return valor_liquido
     */
    public  double Valor_Deposito() {
        double valor_liquido = sueldo_basico - Calcular_Aporte_IES();
        return valor_liquido;
    }
    
    
    public static void main(String[] args) {
        
        Ambito_Variables objeto = new Ambito_Variables();
        double calculo = objeto.Calcular_Aporte_IES();
        System.out.println("Suel basico" + objeto.sueldo_basico);
        System.out.println("El aporte al IES es: " + calculo);
        double valor_deposito = objeto.Valor_Deposito();
        System.out.println("Valor a depositar al trabajador" + valor_deposito);
       
    }
    
}
