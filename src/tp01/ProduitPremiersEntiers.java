/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class ProduitPremiersEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // VARIABLES
        int i ,n;
        long produit;
        Scanner reader = new Scanner (System.in);
        
        System.out.print("Entrez une valeur : ");
        n=reader.nextInt();
        produit = 1;
        
        for ( i=2 ;i<=n; i++){
        produit = (byte) (produit * i) ;
        }
        
        System.out.println("le produit vaut : " + produit);
        
        
    }
    
}
