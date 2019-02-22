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
public class e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*11.Escriba un programa donde se ingrese el tiempo necesario para un cierto 
        proceso en horas, minutos y segundos. Se calcule el costo total del proceso sabiendo 
        que el costo por segundo es  Bs0,25.*/
        Scanner dato = new Scanner(System.in);
        float seg = (float ) 0;
        float min = (float ) 0;
        float hora = (float ) 0;
        float PRE_SEG = (float ) 0.25;
        float tiempo_s = (float ) 0;
        System.out.println("Ingresa la cantidad de horas:.");
        hora = Float.valueOf(dato.next());
        System.out.println("Ingresa la cantidad de minutos:.");
        min = Float.valueOf(dato.next());
        System.out.println("Ingresa la cantidad de segundos:.");
        seg = Float.valueOf(dato.next());
        tiempo_s = seg + (min * 60 )+ ((hora * 60)*60) ;
        System.out.println("El costo es:."+ (tiempo_s * PRE_SEG));
    }
    
}
