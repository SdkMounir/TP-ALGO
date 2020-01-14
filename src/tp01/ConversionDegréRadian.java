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
public class ConversionDegréRadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTE
        double PI=3.1415926;
        //VARIABLE
        double angle, resultat;
        Scanner reader = new Scanner (System.in);
        
        System.out.print("Entrez la valeur de l'angle en degres:");
        angle=reader.nextDouble();
        resultat = (angle * PI)/180;
         System.out.println("angle en radian:" + resultat);
    }
    
}
