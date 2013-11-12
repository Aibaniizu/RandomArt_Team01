/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

/**
 *
 * @author Chanidapa
 */
public class Eval {
     private int x;
     private int y;
     private int z;
     private Exp exp;

    public Eval() {
        this.z = 0;
    }
    
    public void randomXY(){
        this.x = (int) Math.random();
        this.y = (int) Math.random();
        //this.z = Eval(exp, x, y);
    }
     
     
}
