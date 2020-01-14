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
public class IndexElemntPlusGrd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        final int n = 5;
        int i, idMax;
         int [] tab;
         tab = new int [n];
         
         for (i=0; i<n; i++){
             System.out.print("Saisir une valeur : ");
             tab[i]=reader.nextInt();
         }
         
         idMax= 0;
         
         for (i=0; i<n; i++){
             if (tab[i]>tab[idMax]){
                 idMax = i;
                 
             }
             
             }
         System.out.print("Index de l'élément le plus grand : " + idMax);
         
             }
         }
         
    
    