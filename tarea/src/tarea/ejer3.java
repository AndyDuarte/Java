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
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dentro = new Scanner(System.in);
        int opcion = 0;
        float moneda_q = 0;
        float moneda_d = 0;
        float valor_q = (float) 7.5;
        float valor_d = (float) 7.5;
        float conversion = 0;
        
        System.out.print("convertir dolares a quetzales OP.<1> o quetzales a dolares OP.<2>:");
        opcion = Integer.valueOf(dentro.next());
        if (opcion == 1)
        {
            System.out.print("Ingrese cantidad en dolares:.");
            moneda_d = Float.valueOf(dentro.next());
            conversion = (valor_q*moneda_d);
            System.out.println("tu cantida en quetzales es de::"+conversion);
        }
        
        else if (opcion == 2)
        {
            System.out.print("Ingrese cantidad en quetzales:.");
            moneda_q = Float.valueOf(dentro.next());
            conversion = (moneda_q/valor_d);
            System.out.println("tu cantida en dolares es de::"+conversion);
        }
        
        else
        {
            System.out.println("opcion no valida");
        }
       
    }
    
    
}
