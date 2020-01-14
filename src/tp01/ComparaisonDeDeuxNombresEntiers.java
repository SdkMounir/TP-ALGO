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
public class ComparaisonDeDeuxNombresEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        int nb1, nb2;
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Entrez la valeur de nb1");
        nb1=reader.nextInt();
        
        System.out.println("Entrez a valeur de nb2");
        nb2=reader.nextInt();
        
        if (nb1 < nb2){
            System.out.print("nb1 est plus petit que nb2");
        }
        else if (nb1>nb2){
            System.out.print("nb1 est plus grand que nb2");
          }
        else{
            System.out.print("nb1 est identique a nb2");
        }
        
           
                
                
    }
    
}
