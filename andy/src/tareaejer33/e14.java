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
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*14.Leer tres números enteros de un Digito y almacenarlos en una sola 
        variable que contenga a esos tres dígitos Por ejemplo si A=5 y B=6 y C=2 entonces X=562.*/
        Scanner dato = new Scanner(System.in);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int resultado = 0;
        System.out.println("Ingresa el valor1:");
        v1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa el valor2:");
        v2 = Integer.valueOf(dato.next());
        System.out.println("Ingresa el valor3:");
        v3 = Integer.valueOf(dato.next());
        
        resultado = Integer.valueOf(String.valueOf(v1)+String.valueOf(v2)+String.valueOf(v3));
        System.out.println("El resultado es:" + resultado);
    }
    
}
