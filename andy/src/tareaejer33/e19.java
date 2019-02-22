/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaejer33;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 19.Un alumno desea saber cual será su calificación final en la materia 
        de Algoritmos. Dicha calificación se compone de tres exámenes parciales.*/
        Scanner dato = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int n_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        nota1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa segunda nota:.");
        nota2 = Integer.valueOf(dato.next());
        System.out.println("Ingresa tercera nota:.");
        nota3 = Integer.valueOf(dato.next());
        
        System.out.println("Tu nota final es:"+(nota1 + nota2 + nota3));
    }
    
}
