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
public class e17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 17.Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas, 
        el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        tres ventas que realiza en el mes y el total que recibirá en el mes 
        tomando en cuenta su sueldo base y comisiones.*/
        Scanner dato = new Scanner(System.in);
        float TASA = (float) 0.10;
        float sueldo = (float) 0;
        float venta1 = (float) 0;
        float venta2 = (float) 0;
        float venta3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = Float.valueOf(dato.next());
        
        System.out.println("Ingrese valor de la primera venta:");
        venta1 = Float.valueOf(dato.next());
        System.out.println("Ingrese valor de la segunda venta:");
        venta2 = Float.valueOf(dato.next());
        System.out.println("Ingrese valor de la tercera venta:");
        venta3 = Float.valueOf(dato.next());
        
        comision = (venta1 + venta2 + venta3) * TASA;
        
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("tu comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
        
    }
    
}
