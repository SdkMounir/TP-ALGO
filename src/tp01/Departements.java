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
public class Departements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Constantes 
        int dept;
        Scanner reader = new Scanner (System.in);
        
        System.out.print("Entrez votre département (13,83,84) : ");
        dept=reader.nextInt();
        
        switch (dept) {
            case 13 :
            System.out.println("Bouches-Du-Rhônes");
            break;
            
            case 83 :
            System.out.println("VAR");
            break;
            
            case 84 :
            System.out.println("Vaucluses");
            break;
            
            default:
                System.out.println("Réponse non valide");
            
            
        }
        
       
        
    }
    
}
