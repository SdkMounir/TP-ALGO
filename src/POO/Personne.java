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

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the anneeNaissance
     */
    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    /**
     * @param anneeNaissance the anneeNaissance to set
     */
    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    private String nom;
    private int anneeNaissance;
    private int salaire;

    public Personne(String nom, int anneeNaissance, int salaire) {
        this.nom = nom;
        this.anneeNaissance = anneeNaissance;
        this.salaire = salaire;
    }

    public Personne() {
    }
    
   
    
    
    
    
    
    
public  int calculAge(){
    
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    return year - getAnneeNaissance();
}

 public  void Affiche(){
     System.out.printf("%s Agé de %d ans gagne %d par an \n", getNom(), calculAge(), getSalaire());
     
     
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
