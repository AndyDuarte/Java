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
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*6.Calcular el nuevo salario de un empleado si obtuvo un
        incremento del 8% sobre su salario actual y un descuento de 2,5% por servicios.*/
        Scanner dato = new Scanner(System.in);
        float AUMENTO = (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float sueldo = (float) 0;
        float aumento_s = (float) 0;
        float descuento_s = (float) 0;
        
        System.out.println("Ingresa tu sueldo:.");
        sueldo = Float.valueOf(dato.next());
        aumento_s = sueldo * AUMENTO;
        descuento_s = sueldo * DESCUENTO;
        System.out.println("Tu descuento es: "+ (descuento_s));
        System.out.println("Tu aumento es:" + (aumento_s));
        System.out.println("Tu sueldo actual:." + ((sueldo -descuento_s)+ aumento_s));
        
    }
    
}
