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
public class factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int x, res;
        System.out.print("Entrez un nombre entier : ");
        x = reader.nextInt();
        
        // appel de la fonction 
        res = factorielle(x);
        affiche ();
        System.out.println("La factorielle vaut : " + res );
        affiche();
    }
    
    public static int factorielle(int n){
        int i, resultat; 
        resultat = 1;
        for (i=2 ; i<=n ; i++){
            resultat = resultat *i;
            
        }
        return resultat;
    }
    public static void affiche() {
        System.out.println("****************************");
    }
}
