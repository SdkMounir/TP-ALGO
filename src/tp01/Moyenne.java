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
public class Moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //VARIABLES 
       int n1, n2, n3, n4;
       double moyenne, resultat;
       Scanner reader = new Scanner (System.in);
       
       System.out.print("Entrer les valeurs de la moyenne:");
       n1=reader.nextInt();
       System.out.print("Entrer les valeurs de la moyenne:");
       n2=reader.nextInt();
       System.out.print("Entrer les valeurs de la moyenne:");
       n3=reader.nextInt();
        System.out.print("Entrer les valeurs de la moyenne:");
       n4=reader.nextInt();
       moyenne = n1 + n2 + n3 + n4;
       resultat = moyenne/4;
       System.out.println("La moyenne est:" + resultat);
       
    }
    
}
