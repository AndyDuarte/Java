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
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*4.Calcular el cambio de monedas en dólares y euros
        al ingresar cierta cantidad en Bs. (tipo de cambio $= 2,150Bs, Euros: 1,45 $ ).*/
        
        Scanner dato = new Scanner(System.in);
        int T_DOLARES = 2150;
        int T_EUROS = 145;
        float dinero = (float)  0;
        System.out.println("Ingresa la cantidad a convertir:+");
        dinero = Float.valueOf(dato.next());
        
        System.out.println("La conversion a Dolares es:."+(dinero * T_DOLARES));
        System.out.println("La conversion a Euros es:."+(dinero * T_EUROS));
    }
    
}
