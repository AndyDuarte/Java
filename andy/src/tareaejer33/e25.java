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
public class e25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        System.out.println("ingrese un numero");
        num = Integer.valueOf(sc.next());
        System.out.println("ingrese un segundo numero");
        num1 = Integer.valueOf(sc.next());
        if (num >= 0 && num1 >= 0)
        {
            System.out.println("la suma es:."+(num+num1));
            System.out.println("la multiplicacion es:."+(num*num1));
        }
        else{
            System.out.println("ingrese un numero positivo");
        }
        
    }
    
}
