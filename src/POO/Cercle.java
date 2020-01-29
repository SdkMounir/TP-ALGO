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
public class Cercle extends Figure2D {

  private double rayon;
    
  
  public Cercle (){}
  public Cercle( double x, double y, double rayon){
      super (x,y);
      this.rayon = rayon;
  }
  
  public double calcSurface (){
      
  return Math.PI * getRayon() * getRayon();
  }

    /**
     * @return the rayon
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * @param rayon the rayon to set
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
}
