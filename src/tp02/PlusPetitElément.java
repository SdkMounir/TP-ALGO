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
public class PlusPetitElément {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        final int NL = 5;
        final int NC = 2;
        
        int Min, i, j;
        int [][] tab;
        tab = new int [NL] [NC];
        
        
        for ( i=0; i<NL; i++){
            for (j=0 ; j<NC; j++){
                System.out.print("Saisir une valeur : ");
                tab[i][j]= reader.nextInt();
            }
        }
        Min = tab[0][0];
        for (i=0; i<NL; i++){
            for (j=0; j<NC; j++){
                if (Min > tab[i][j]){
                    Min = tab[i][j];
                }
            }
        }
        System.out.println("Le Minimum est :" + Min);
        
    }
    
}
