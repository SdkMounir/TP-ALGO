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
public class Moyenne2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
         final int NL=5;
         final int NC = 2;
         
         int somme, i, j;
         double moyenne;
         int [][] tab;
         tab = new int [NL] [NC];
         
         
         for (i=0; i<NL; i++) {
             for (j=0; j<NC; j++){
                 System.out.print("Saisir une valeur :");
                 tab[i][j]=reader.nextInt();
             }
         }
         somme = 0;
          for (i=0; i<NL; i++){
              for (j=0; j<NC; j++){
                  somme = somme + tab[i][j];
              }
          }
          moyenne = somme / (NL*NC);
          System.out.println("La moyenne vaut : "+ moyenne);
    }
    
}
