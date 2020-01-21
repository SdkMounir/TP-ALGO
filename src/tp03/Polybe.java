/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;
import static tp03.Polybe.Code_Polybe;

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
         
        String mot;
        System.out.print(" \nEntrez un mot : ");
        mot = reader.next();
        int [] mot_chiffre = Code_Polybe(mot);
        for (i=0; i< mot_chiffre.length; i++)
        System.out.print( mot_chiffre[i] + " ");
        
      

         
        System.out.print( "\nDecryptage :");
        System.out.println(Decode_Polybe(mot_chiffre));
        
    }
    
    public static int[] Code_Polybe( String mot){
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
     char lettre ;
     int pos = 0;
     int  [] c;
     c = new int [mot.length()*2];
     
     for(int k = 0 ; k < mot.length(); k++){
         
         lettre = mot.charAt(k);
         if (lettre =='W') lettre ='V';
          for (i=0; i<n; i++){
              for (j=0; j<n; j++){
                  if (lettre == tab[i][j]){
                      c[pos++] = i;
                      c[pos++] = j;
                  }
              }
          }
  
     }
     return c;
    }
    
    public static String Decode_Polybe(int [] mot_crypte){
        int i,j,k;
        final int n = 5;
        char [][] T= new char [][]{
        
            {'A','B','C','D','E'},
            {'F','G','H','I','J'},
            {'K','L','M','N','O'},
            {'P','Q','R','S','T'},
            {'U','V','X','Y','Z'}
    };
        String mot = " "; 
       for (k=0; k < (mot_crypte.length)-1; k= k+2){
           
               i=mot_crypte[k];
               j=mot_crypte[k+1];
               
               if (T[i][j] == 'V'){
                   mot = mot + "V/W";
               }
               else {
                     mot = mot + T[i][j];
                   }
                           
               
           
       }
    return  mot;
    }
}

