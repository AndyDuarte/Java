/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

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
        Scanner ingresar = new Scanner(System.in);
        
        float num = (float) 0.0;
        
        System.out.println("ingrese numero entre 0 y 9999");
        num = Float.valueOf(ingresar.next());
        
        if (num >= 0 & num <= 9)
        {
            System.out.println("el  numero ingresado tiene 1 cifra");
        }
        else if(num >=10 & num < 100)
        {
            System.out.println("el numero ingresado tiene 2 cifras");
        }
        else if(num >=100 & num < 1000)
        {
            System.out.println("el numero ingresado tiene 3 cifras");
        }
        else if(num >=1000 & num < 10000)
        {
            System.out.println("el numero ingresado tiene 4 cifras");
        }
        else
        {
            System.out.println("ibgrese un numero en el rango establecido");
        }
        
        
    }
    
}
