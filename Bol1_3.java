
package bol1_3;

import java.util.Scanner;

public class Bol1_3 {

    public static void main(String[] args) {
      
        Scanner dinero= new Scanner (System.in);
        float euros,cambio;
        System.out.println("Teclee la cantidad euros =");
        euros = dinero.nextFloat();
        System.out.println("Teclee la cantidad cambio =");
        cambio = dinero.nextFloat();
        float dolares = euros*cambio;
        System.out.println("Son ="+ euros*cambio);
        
       
    }
    
}
