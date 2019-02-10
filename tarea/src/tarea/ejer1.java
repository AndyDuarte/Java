/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author andy-duarte
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dentro = new Scanner(System.in);
        float moneda_q = 0;
        float moneda_d = (float) 7.5;
        float conversion = 0;
        System.out.print("Ingrese cantidad en quetzales:.");
        moneda_q = Float.valueOf(dentro.next());
        conversion = (moneda_q/moneda_d);
        System.out.println("tu cantida en dolares es de::"+conversion);
    }
    
}
