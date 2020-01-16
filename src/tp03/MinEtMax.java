/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class MinEtMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner (System.in);
        
        double nb1, nb2, nb3;
        
        System.out.print("Entrez une valeur:  ");
        nb1 =reader.nextInt();
        System.out.print("Entrez une valeur :  ");
        nb2 = reader.nextInt();
        System.out.print("Entrez une valeur:  ");
        nb3 = reader.nextInt();
        
       
       System.out.println("Le Max est :" + Max(nb1, nb2, nb3));
       System.out.println("Le Min est  :"  + Min(nb1, nb2, nb3));
       
    }
    
    public static int Max( double a, double b, double c ){
       double Max = a;
       if (b > Max ){
           Max = b;
       } 
       if (c > Max ){
           Max = c;
       }
       
        return (int) Max;
        
    }
    
     public static int Min( double a, double b, double c ){
       double Min = a;
       if (b < Min ){
           Min = b;
       } 
       if (c < Min ){
           Min = c;
       }
     
     
       
        return (int) Min;
     }


    
}
