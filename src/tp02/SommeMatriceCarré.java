/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class SommeMatriceCarré {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        // CONSTANTES 
        final int nl = 2;
        final int nc = 2;
        int i, j;
        int [][] tab1, tab2, tab3;
        tab1  = new int [nl][nc];
        tab2 = new int [nl][nc];
        tab3  = new int [nl][nc];
        
        // 1er Tableau 
        for (i=0; i<nl ; i++){
             for (j=0; j<nc; j++){
                System.out.print("Entrer une valeur du tab1 : ");
                tab1[i][j]=reader.nextInt();
            }
        }
        // 2eme Tableau 
        for (i=0; i<nl ; i++){
             for (j=0; j<nc; j++){
                System.out.print("Entrer une valeur du tab 2: ");
                tab2[i][j]=reader.nextInt();
             }
        }
        
                //3eme tableau 
               
        for (i=0; i<nl ; i++){
             for (j=0; j<nc; j++){
                tab3[i][j]= tab1[i][j] + tab2 [i][j];
             }
        
    }
    
        
        //Affichage Matrice resultat
        for ( i = 0; i<nl; i++){
            System.out.println();
            for (j = 0; j<nc ; j++){
                System.out.print(tab3[i][j]+ "\t");
            }
       
       }
    }
}
             

