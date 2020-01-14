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
public class AnnéesBissextile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //VARIABLES
        int années;
        Scanner reader = new Scanner (System.in);
        
        
        do {
            System.out.print("Entrez L'année dans la période 1900-2100 : ");
            années=reader.nextInt();
        } while (années < 1900 || années > 2100);
            
        
        
       
        if (années % 400 == 0 || années % 100 != 0  &&(années % 4 == 0)){
            System.out.println("L'année est bissextile");
        }
        else {
            System.out.println("L'année n'est pas bissextile");
        
        }
    
    }
    
}
