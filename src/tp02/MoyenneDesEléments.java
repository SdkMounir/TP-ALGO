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
public class MoyenneDesEléments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner reader = new Scanner (System.in);
            
        // Constantes
        final int N = 10 ;
        //Variables
        int somme,i;
        double moyenne;
        // declaration du tableau
        int [] tab ;
        // cration du tableau 
        tab = new int[N];
        
        for (i=0; i<=N-1; i++) {
            
            System.out.print("Saisir une valeur : ");
            tab[i]=reader.nextInt();
        }
         somme = 0;
         for (i=0; i<=N-1; i++) {
             somme = somme + tab[i];
             
         }
        moyenne= (double) somme/10;
        System.out.println("La moyenne vaut : " + moyenne);
    }
    
}
