/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

/**
 * Class that returns randomly X or Y
 * 
 * @author erngg and Tiia
 * @version 18/11/2013
 */
public class InputXY extends Random{
    
    private double randomXY;
    private String result;
    
    public InputXY(double randomXY){
        this.randomXY = randomXY;
    }
    public double randomFunction(double x, double y){
        if(this.randomXY <= 0.5){
           return x;
        }
        else{
           return y;
        }
        
    }
    
    public String expression(){
        if(this.randomXY <= 0.5){
            result = "X";
        }
        else{
            result = "Y";
        }
        return result;
    }
}
