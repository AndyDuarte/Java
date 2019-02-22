/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaejer33;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Calcular el monto a pagar en una cabina de Internet si 
        el costo por hora es de Bs/.1,5 y por cada 5 horas te dan 
       una hora de promoción gratis.*/
        Scanner dato = new Scanner(System.in);
        double PRECIO_H = 1.5;
        int horas = 0;
        int horas_gratis = 0;
        System.out.println("Ingrese la cantidad de horas utilizada:.");
        horas = Integer.valueOf(dato.next());
        
        horas_gratis = (horas / 5);
        System.out.println("Tu total a pagar es de:." + (horas * PRECIO_H));
        System.out.println("por el uso de internet obtuviste "+ horas_gratis + " horas gratis");
        
        
    }
    
}
