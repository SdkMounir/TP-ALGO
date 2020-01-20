/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Polybe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int i,j;
        final int n = 5;
        char [][] tab;
        tab = new char [][]{
            {'A','B','C','D','E'},
            {'F','G','H','I','J'},
            {'K','L','M','N','O'},
            {'P','Q','R','S','T'},
            {'U','V','X','Y','Z'}
            
        };
        
       
         for ( i = 0; i<n; i++){
            System.out.println();
            for (j = 0; j<n; j++){
                System.out.print(tab[i][j]+ "\t");
    
    

            }
         }
    }
    
   // public static char decodePolybe(char[]){
}

