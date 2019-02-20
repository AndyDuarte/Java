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
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int año = 0;
        
        System.out.println("ingrese dia");
        dia = Integer.valueOf(ingresar.next());
        System.out.println("ingrese mes");
        mes = Integer.valueOf(ingresar.next());
        System.out.println("ingrese año");
        año = Integer.valueOf(ingresar.next());
        if (año > 0)
        {
            if(mes > 0 & mes <= 12){
                if(dia > 0 & dia <= 30)
                {
                    System.out.println("la fecha es correcta");
                }
                else
                {
                    System.out.println("la fecha no es correcta");
                }
            }
            else
            {
                System.out.println("la fecha no es correcta");
            }
        }
        else
        {
            System.out.println("la fecha no es correcta");
        }
    }
    
    
}
