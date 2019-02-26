/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Andy-Duarte
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer por teclado dos tablas de 10 números enteros
        //y mezclarlas en una tercera de la forma:
        //el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
        
        
        Scanner sc = new Scanner(System.in);
        int a[];
        int b[];
        int c[];
        int j = 0;
        
       a = new int[10];
       b = new int[10];
       c = new int[20];
       
       
       System.out.println("ingrese el primer arreglo:. ");
       for(int i =0; i < 10; i++)
       {
           System.out.print((i+1)+"digite un numero:.");
           a[i] = Integer.valueOf(sc.next());
       }
       System.out.println("");
       
       System.out.println("ingrese el segundo arreglo:. ");
       for(int i =0; i < 10; i++)
       {
           System.out.print((i+1)+"digite un numero:.");
           b[i] = Integer.valueOf(sc.next());
       }
       
       
       for(int i =0; i < 10; i++)
       {
           c[j] = a[i];
           j++;
           c[j] = b[i];
           j++;
       }
        System.out.print("\nel tercer arreglo es:.");
        for(int i =0; i < 20; i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println("");
    }
    
}
