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
public class TableDeMuliplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        System.out.print("Saisir une valeur : ");
        int x = reader.nextInt();
        AfficheTM(x);
        
    }
    
    public static void  AfficheTM( int n) {
        for(int i=1; i<=10; i++){
            System.out.printf(" %d * %d = %d\n " , i, n, n*i);
        
            
        
    }
            
        
    }
    
}
