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
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        String num = "";
        String invert ="";
        
        System.out.println("ingrese numero de 0 y 9999");
        num = ingresar.next();
        for (int i = num.length()-1; i >= 0; i--)
            invert = invert + num.charAt(i);
        System.out.println(invert);
            
    
    }
}
