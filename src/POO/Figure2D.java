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
public abstract class Figure2D {
    
    private double x;
    private double y;
    
    
    public Figure2D  (){}
    public Figure2D(double x, double y){
        this.x= x;
        this.y=y;
    }
    
    public abstract double calcSurface();

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
        
    
    
    
 
}
