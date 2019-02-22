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
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un constructor sabe que necesita 0,5 metros cúbicos de 
        arena por metro cuadrado de revoque a realizar.
        Hacer un programa donde ingrese las medidas de una pared (largo y alto) 
        expresada en metros y obtenga la cantidad de arena necesaria para revocarla*/
        Scanner dato = new Scanner(System.in);
        float M_CUBICO = (float)0.5;
        float largo = 0;
        float anch = 0;
        
        System.out.println("Ingrese largo de la pared en metros:");
        largo = Float.valueOf(dato.next());
        System.out.println("Ingrese ancho de la pared en metros:");
        anch =  Float.valueOf(dato.next());
        
        System.out.println("La arena requerida es:."+ ((largo * anch )*M_CUBICO));
        
    }
    
}
