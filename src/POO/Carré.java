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
public class Carré extends Figure2D {

    
    private double cote;
    
    public Carré (){}
    public Carré ( double x, double y, double cote){
        super (x,y);
        this.cote=cote;
    }
    
    public double calcSurface(){
        return getCote() * getCote();
    }

    /**
     * @return the cote
     */
    public double getCote() {
        return cote;
    }

    /**
     * @param cote the cote to set
     */
    public void setCote(double cote) {
        this.cote = cote;
 
    }
    
    public  void Affiche1(){
     System.out.printf("%d Le coté vaut ",  calcSurface() );
    }
}
