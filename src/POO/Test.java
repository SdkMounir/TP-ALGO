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
        
        
        // Calcule de la surface avec tableau du Cercle et de Carré.
        /*
        Figure2D[] tab = { new Carré(0,0,10),
                           new Cercle (15,10,10)
                         };
        double surfTotale=0;
        
        for (int i=0; i < tab.length ; i++){
            surfTotale += tab[i].calcSurface();
        }
        
        System.out.printf( "Surface totale : %5.2f\n" , surfTotale);
        */
        
        
        // Autre méthode (Polymorphisme)
         
        Figure2D[] tab = new Figure2D[2];
        tab[0] = new Carré(0,0,10);
        tab[1] = new Cercle(15,10,10);
        
        double surfTotale=0;
        for (int i=0;  i<tab.length; i++){
            surfTotale = surfTotale + tab[i].calcSurface();
        }
                    
        System.out.printf( "Surface totale : %5.2f\n" , surfTotale);

        }
    }
    
}
