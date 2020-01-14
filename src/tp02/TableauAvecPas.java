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
public class TableauAvecPas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        final int NL=10;
        final int NC=2;
        int i=0, j=0, P, valD, val;
        int [][] tab;
        tab = new int [NL][NC];
        
                System.out.print("Saisissez une valeur : ");
                valD=reader.nextInt();
                
                System.out.print("Saisissez un Pas : ");
                P=reader.nextInt();
                val = valD;
                
  
        
        for (i=0; i<NL; i++){
            for (j=0; j<NC; j++){
                
                //1er Méthode Plus Lisibles 
                
                tab[i][j]= val;
                val = val + P ; 
                
                
                // 2eme Méthode 
                /*tab[i][j] = (2*i + j )*P + valD;*/
                
            }
        }
        
        //Affichage Matrice resultat
        for ( i = 0; i<NL; i++){
            System.out.println();
            for (j = 0; j<NC ; j++){
                System.out.print(tab[i][j]+ "\t");
    }
        }
    }
    
}
