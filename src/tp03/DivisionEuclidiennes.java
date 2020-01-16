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
public class DivisionEuclidiennes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        int dividende, diviseur; 
        int [] res;
        
        System.out.print("Entrez le Dividende:  ");
        dividende =reader.nextInt();
        System.out.print("Entrez le Diviseur :  ");
        diviseur = reader.nextInt();
        res= divEuclidienne(dividende, diviseur);
       
       System.out.println("Quotient :" + res[0]);
       System.out.println("Reste :"  +res[1] );
       
    }
    
    public static int [] divEuclidienne(int dividende, int diviseur){
        final int n=2;
        int [] resultat;
        resultat = new int [n];
        resultat[0]= dividende / diviseur;
        resultat[1]= dividende % diviseur;
        return resultat;
        
        
        
    }
    
}
