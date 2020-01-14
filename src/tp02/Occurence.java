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
public class Occurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        //Constante
        final int n=10;
        
        //Variables
        int i,c,m;
        int [] tab;
        tab = new int [n];
        
        for (i=0; i<=n-1; i++){
            System.out.print("Saisir une valeur :");
            tab[i]=reader.nextInt();
        }
        
        System.out.print("Saisir une nouvelle valeur : " );
        m=reader.nextInt();
        c=0;
        for (i=0; i<=n-1; i++){
            if (tab[i] == m ) {
                c++;
            }
            
               
            
        }
        System.out.print("Nb D'occurences de la valeure : " +c );
        
        
        
    }
    
}
