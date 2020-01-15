/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAlgo;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Amplitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        final int NL = 5;
        final int NC = 2;
        int i, j, MAX, MIN, AMPLITUDE;
        int [][] tab;
        tab = new int [NL][NC];
        
        for (i=0; i<NL; i++){
            for (j=0; j<NC; j++){
                System.out.print("Saisissez une valeur : ");
                    tab[i][j]=reader.nextInt();
            }
        }
        // Recherche De la valeur Minimum du tableau
        MIN = tab[0][0];
        
        for (i=0; i<NL; i++){
            for (j=0; j<NC; j++){
                if (tab[i][j]< MIN){
                    MIN = tab [i][j];
                }
            }
        }
        // Recherche de la valeur Maximum du tableau
         MAX = tab[0][0];
        
        for (i=0; i<NL; i++){
            for (j=0; j<NC; j++){
                if (tab[i][j]> MAX){
                    MAX = tab [i][j];
                }
            }
        }
        // Calcul de l'amplitude 
                AMPLITUDE = 0;
                for (i=0; i<NL; i++){
                   for (j=0; j<NC; j++){
                       AMPLITUDE = MAX - MIN;
                   }
                }
                
               
                //Affichage Matrice resultat
        for ( i = 0; i<NL; i++){
            System.out.println();
            for (j = 0; j<NC ; j++){
                System.out.print(tab[i][j]+ "\t");
                
             
            }
        }
            
        
         System.out.println("L'amplitude de ce tableau est de : " + AMPLITUDE );
        
        
        
    }
    
}
