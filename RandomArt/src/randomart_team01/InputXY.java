/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

/**
 *
 * @author erngg
 */
public class InputXY extends Random{
    
    private int randomXY;
    private String result;
    
    public InputXY(int randomXY){
        this.randomXY = randomXY;
    }
    public double randomFunction(double x, double y){
        if(this.randomXY == 0){
           return x;
        }
        else{
           return y;
        }
        
    }
    
    public String expression(){
        if(this.randomXY == 'x'){
            result = "X";
        }
        else{
            result = "Y";
        }
        return result;
    }
}