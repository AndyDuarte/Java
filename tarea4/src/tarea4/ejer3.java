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
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;
        int ayu = 0;
        int invert= 0;
        int cif = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero que sea de dos dijitos: ");
            num = Integer.valueOf(entrada.next());
        } while (num < 10);
 
        ayu = num;
        while (ayu!=0){
            cif = ayu % 10;
            invert = invert * 10 + cif;
            ayu = ayu / 10;
        }
 
        if(num == invert){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
    
}
