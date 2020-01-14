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
public class NombrePairImpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        int n;
        Scanner reader = new Scanner (System.in);
        
        
        System.out.print("Nombre:");
        n=reader.nextInt();
        
        
        if ( n%2 == 0){
         System.out.print("pair");}
        else{ 
        System.out.print("impair");}
        
    }
    
}
