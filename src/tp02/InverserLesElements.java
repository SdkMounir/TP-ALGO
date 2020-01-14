/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class InverserLesElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        //Constantes
        final int n = 10;
        
        //Variables
        int i,invrs;
        int [] tab;
        tab = new int [n];
       
        
        for (i=0; i<n-1; i++){
            System.out.print ("Saisir une valeur : ");
            tab[i]=reader.nextInt();
        }
       
        for (i=0; i<n/2; i++){
            invrs=tab[i];
            tab[i] = tab [n-1-i];
            tab[n-1-i] = invrs ;}
        
    
       System.out.println("Tableau Inverser : " );
       for ( i=0; i<n-1; i++)
       { System.out.print(tab[i]);
       System.out.println("");
       }
  
        
    }
    
}
