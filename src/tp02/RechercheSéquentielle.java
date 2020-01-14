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
public class RechercheSéquentielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        final int n=10;
        int i;
        boolean  TousPairs;
        int [] tab;
        tab = new int [n];
        
        for (i=0; i<=n-1; i++){
            System.out.print("Saisir une valeur :");
            tab[i]=reader.nextInt();
            
        }
        i=0;
        TousPairs= true;
        while(i<n && TousPairs){
            if ( tab[i]%2 == 1){
                TousPairs = false;
            }
            i=i+1;
        }
        System.out.println("Tous les éléments sont pairs : " + TousPairs);
    }
    
}
