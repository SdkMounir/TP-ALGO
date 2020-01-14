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
public class Diametre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES 
        //final double PI = 3.1415926;
        
        //VARIABLE
        double diametre, resultat;
        Scanner reader = new Scanner (System.in);
        
        System.out.print("le diamètre est de");
        diametre = reader.nextDouble();
        resultat =diametre*Math.PI;
        System.out.println("La valeur de la circonférence est :" +resultat);
    }
    
}
