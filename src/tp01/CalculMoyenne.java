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
public class CalculMoyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        int  n, somme=0 ;
        double moyenne;
        
        for (int i=1; i<=4; i++){
        System.out.print("Entrez un nombre entier ");
        n=reader.nextInt ();
        somme = somme + n;
        }
        moyenne = somme /4.0;
        System.out.println("La Moyenne vaut :" + moyenne);
    }
    
}
