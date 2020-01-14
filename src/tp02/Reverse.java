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
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        final int n = 10;
        int i;
        int [] tab1;
        int [] tab2;
        tab1 = new int [n];
        tab2 = new int [n];
        
        // Lecture 1er Tableau 
        for (i= 0 ; i<= n-1; i++){
            System.out.print("Saisir une valeur : ");
            tab1[i]=reader.nextInt();
        }
        
        //Reverse 
        for (i= 0; i<=n-1; i++){
            tab2[i] = tab1[n-i-1];
        }
        
        //Affichage second tableau 
        for (i=0 ; i<=n-1; i++){
            System.out.println( tab2[i] + "");
        }
        
    }
    
}
