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
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer 5 números y mostrarlos en orden inverso al introducido.
        Scanner sc = new Scanner(System.in);
        int arreglo[];
        arreglo = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un valor ");
            arreglo[i] = Integer.valueOf(sc.next());
        }
        
        System.out.println("Los valores son");
        
        for (int i = 4; i >=  0; i--) {
            System.out.println("El valor es "+ arreglo[i]);
        }
    }
    
}
