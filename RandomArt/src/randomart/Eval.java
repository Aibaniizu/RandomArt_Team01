/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 *
 * @author Chanidapa 55130500210
 */
public class Eval {
     private int x;
     private int y;
     private int z;
     private Exp exp;

    public Eval() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
     private Eval(Exp exp, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void randomXY(){
        this.x = (int) Math.random();
        this.y = (int) Math.random();
        //this.z = Eval(exp, x, y);
    }
    
   
}
