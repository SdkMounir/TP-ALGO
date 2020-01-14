/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables
        int somme, ad, d, n, i;
        Scanner reader = new Scanner (System.in);
         System.out.print("Entrez la valeur de n : ");
        n=reader.nextInt();
        
        switch(n) {
            case 1 :
            case 2 : System.out.println("Le resultat vaut 1");
                   break;
                   
            default: ad=1;
                     d=1;
                     for ( i = 3 ; i <= n ; i++){
                         somme = d + ad;
                         ad = d;
                         d = somme;
                     }
                      System.out.println("Terme de la suite : "+ d);
        }       
       
        
        
        
        
    }
    
}
