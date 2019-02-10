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
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dentro = new Scanner(System.in);
        
        float num = 0;
        float cuadrado = 0;
        float cubo = 0;
        int incremento = 0;
        
        while (incremento != 5)
        {
            System.out.println("Ingrese numero para elevarlo al cuadrado y al cubo");
            num = Float.valueOf(dentro.next());
            cuadrado = num*num;
            cubo = num*num*num;
            System.out.println("el cuadrado del numero es:."+cuadrado);
            System.out.println("el cubo del numero es:."+cubo);
            incremento++;
        }
        
    }
    
}
