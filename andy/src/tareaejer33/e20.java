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
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes*/
        Scanner dato = new Scanner(System.in);
        int n_hombre = 0;
        int n_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        n_hombre = Integer.valueOf(dato.next());
        System.out.println("Ingresa la cantidad de mujeres:");
        n_mujeres = Integer.valueOf(dato.next());
        
        total = n_hombre + n_mujeres;
        
        System.out.println("El porcentaje de mujeres es:" + ((n_mujeres *100) / total));
        System.out.println("El porcentaje de hombres es:" + ((n_hombre *100) / total));
    }
    
}
