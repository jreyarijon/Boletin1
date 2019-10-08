/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol1_5;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner distancia= new Scanner (System.in);
        int Mm;
        final int m = 1852;
        System.out.println("Teclee millas marinas =");
        Mm = distancia.nextInt();
        System.out.println("Distancia en metros ="+ (Mm*m));
        
    }
    
}
