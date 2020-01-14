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
public class MatriceCarréParfait {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        // VARIABLES 
        int i, j, n , x;
        int[][] Cm;
        
        System.out.print("Entrer l'orde du carré magique");
                n=reader.nextInt();
        Cm = new int[n][n];
        
        i = n/2;
        j = i +1;
        Cm[j][i] = 1;
         
        for (x=2;x<=n*n; x++){
            if((x-1) %n == 0){
                j = (j + 2) %n;
            }
            else{j=(j+1) %n;
            i = (i+1) %n;
            }
            
            Cm [j][i] = x ;
        }
        // Affichage de carré magique parfait 
        
        for (int li = 0; li < n; li++){
            System.out.println();
            for (int lj = 0; lj < n ; lj++){
                System.out.print(Cm[j][i]+"\t");
            }
        }
        
       
        
        
    }
    
    
}
