/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;
import static tp03.factorielle.affiche;
import static tp03.factorielle.factorielle;

/**
 *
 * @author formation_gep
 */
public class FactorielleRécursivité {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
        int n;
        System.out.print("Entrez un nombre entier : ");
        n = reader.nextInt();
        System.out.printf("%d! = %d\n",n,fact(n) );
        
    }
    
    public static int fact(int n){
            if (n==0)
                return 1;
            else  
                return n*fact(n-1);
        }
             
}

