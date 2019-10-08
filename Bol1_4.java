/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_4;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op= new Scanner (System.in);
        float a,b;
        System.out.println("Teclee 1ª cifra =");
        a = op.nextFloat();
        System.out.println("Teclee 2ª cifra =");
        b = op.nextFloat();
        System.out.println("Suma ="+ (a+b) +"\nResta ="+ (a-b) +"\nProducto ="+ (a*b) +"\nCociente ="+ (a/b) );
        
        
    }
    
}
