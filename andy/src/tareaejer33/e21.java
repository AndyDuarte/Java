/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaejer33;

import java.util.Scanner;

/**
 *
 * @author andy-duarte
 */
public class e21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float P = (float) 0.25;
        float sal = 0;
        float nuevo = 0;
        
        System.out.println("ingrese su sueldo anterior");
        System.out.println("para calcular su aumento");
        sal = Float.valueOf(sc.next());
        nuevo = sal*P;
        System.out.println("su nuevo sueldo es de "+(sal+nuevo));
        
    }
    
}
