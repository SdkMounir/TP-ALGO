/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author formation_gep
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personne p1 = new Personne ("MARTIN ", 1980,10000);
        p1.setNom("DURANT");
        p1.Affiche();
        
        Personne P2 = new Personne();
        P2.setNom("BASILE");
        P2.setSalaire(123456789);
        P2.setAnneeNaissance(1998);
        
        P2.Affiche();
        
    }
    
}
