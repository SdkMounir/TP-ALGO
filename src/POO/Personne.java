/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Calendar;

/**
 *
 * @author formation_gep
 */
public class Personne {

    private String nom;
    private int anneeNaissance;
    private int salaire;
    
    public Personne(){}
    
    public Personne(  String nom, int DateDeNaissance, int Salaire ){
    this.nom = nom;
    anneeNaissance = DateDeNaissance;
    salaire = Salaire;
        
    }
    

public  int calculAge(){
    
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    return year - anneeNaissance;
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personne P1 = new Personne ("Joe", 1990, 12000);
        Personne P2 = new Personne ("Joe", 1990, 12000);
        
        if (P1 .equals(P2) ){
            System.out.print ( "Ce ne sont pas les meme ");
        }
        else {
            System.out.print("Ce sont les meme personne ");
        }
    }
    
}
