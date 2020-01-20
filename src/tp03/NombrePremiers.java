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
public class NombrePremiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        System.out.print("Entrez une valeur : ");
        int n;
        String msg;
        n= reader.nextInt();
        
        //2 METHODE POUR APPELE UNE FONCTION {
        
        /*
        if (EstPremiers(n)){
            System.out.print("C'est un nombre premier ");
        } else {
            System.out.print("C'est pas nombre premier ");
        }*/

       
        
        {
        // OPERATEUR TERNAIRE ( EQUIVALENT AU IF AU DESSUS ET PLUS RAPIDE A ECRIRE )
        msg = (EstPremiers(n)) ? "C'est un nombre premier " : " C'est pas un nombre premier ";
                                  //Si retourne Vrai               //Si retourne FAUX
         System.out.println(msg);
        }
        
        //FIN }
         
         // AJOUT D'UNE PROCEDURE
         System.out.print("Choix de la valeur de n : ");
         int n2 = reader.nextInt();
         AfficheNP(n2);
         
         // AJOUT D'UNE 2EME PROCEDURE
         System.out.print("Choix d'une valeur : ");
         int n3= reader.nextInt();
         AfficheNPJ(n3);
         
         
    }
    
    public static boolean EstPremiers( int a){
        int div;
        boolean FAUX = false;
        
        if ( a%2 == 0 ){
            return FAUX;
        }
        div = 3;
                while ( div*div <= a && a%div > 0){
                    div = div +2 ;
                            }
                
                        
    return div*div > a;
    }
    
    public static void AfficheNP(int n2){
        System.out.println("Liste des nombres premiers de l'intervalle [3,n]:");
        for ( int i=3; i<=n2; i++){
            if ( EstPremiers(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFin de liste ");
    }
    
    public static void AfficheNPJ(int n3){
         System.out.println("Liste des nombres premiers de l'intervalle [3,n]:");
         int ad, d = 2;
         for ( int i=3; i<=n3; i++){
             if ( EstPremiers(i)){
                 ad = d;
                 d = i;
                 if ( d == ad + 2)
                     System.out.printf("Premiers Jumeaux : %d %d\n", ad, d);                 
             }
         }
    }
    
}




        
        
        
        
             
          
          
        
    



                
                    
                
            
                
            
        
    
    

