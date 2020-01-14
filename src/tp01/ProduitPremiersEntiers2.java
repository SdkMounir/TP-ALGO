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
public class ProduitPremiersEntiers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES 
        Scanner reader = new Scanner (System.in);
        int i=1 , n;
        long produit;
        
        System.out.print("Entrez la valeur de n : ");
        n = reader.nextInt();
        produit = 1;
         while (i <=n){
             produit = produit * i;
         i = i +1;
         }
         
         System.out.println("Le produit est : " + produit);
        
    }
    
}
