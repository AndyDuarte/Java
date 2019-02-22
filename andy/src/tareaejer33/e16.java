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
public class e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 16.Suponga que un individuo desea 
        invertir su capital en un banco y desea saber cuanto dinero ganará después 
        de un año si el banco paga a razón de 2,5% mensual.*/
        Scanner dato = new Scanner(System.in);
        
        float TASA = (float) 0.025;
        float capital = (float) 0;
        float interes = (float) 0;
        
        System.out.println("Ingresa el capital:");
        capital = Float.valueOf(dato.next());
        interes = (capital * TASA) *12;
        System.out.println("Tu interes es de:." + interes);
        
    }
    
}
