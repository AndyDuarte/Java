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
public class e29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa nota1");
        n1 = Float.valueOf(sc.next());
        System.out.println("ingresa nota2");
        n2 = Float.valueOf(sc.next());
        System.out.println("ingresa nota3");
        n3 = Float.valueOf(sc.next());
        promedio = (n1+n2+n3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
        
        
        
    }
    
}
