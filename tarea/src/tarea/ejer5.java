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
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dentro = new Scanner(System.in);
        String producto = "";
        float precio = 0;
        float total = 0;
        
        while (precio >= 0)
        {
            System.out.println("Ingrese el nombre del producto");
            producto = dentro.next();
            System.out.println("Ingrese el precio del producto");
            precio = Float.valueOf(dentro.next());
            
            if (precio >= 1 )
            {
                total = (total+precio);
            }
            
            
        }
        System.out.println("El total es de:."+total);
        if (total >= 1500)
        {
            System.out.println("Con el descuento el total a pagar es de:."+((total)-(total*0.1)));
        }
        else if (total >= 500)
        {
            System.out.println("Con el descuento el total a pagar es de:."+((total)-total*0.05));
        }
        
    }
    
}
