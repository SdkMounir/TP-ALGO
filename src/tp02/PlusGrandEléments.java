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
public class PlusGrandEléments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
         // Constantes
        final int N = 4;
        //Variables
        int MAX ,i;
        // declaration du tableau
        int [] tab ;
        // cration du tableau 
        tab = new int[N];
        
         MAX= tab[0];
        for (i=0; i<=N-1; i++) {
            
            System.out.print("Saisir une valeur : ");
            tab[i]=reader.nextInt();
            if (MAX < tab[i]) {
                MAX = tab[i];
            }
             
             
         }
        
        System.out.println("Le Max vaut: " + MAX);
    }
    
}
