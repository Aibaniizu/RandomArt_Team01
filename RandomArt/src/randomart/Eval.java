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
 * @author Chanidapa
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
    
    //Just for debug
    /*public static void main(String args[]) throws Exception{
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
        //String foo = "avg(45,15)";
        engine.eval("sin = Math.sin; cos = Math.cos; pi = Math.PI; function avg(a, b){ return (a+b)/2;}");
        int x = 23;
        int y = 27;
        engine.eval("x =" + x + "; y = " + y + ";");
        System.out.println(engine.eval("cos(pi*cos(pi*x))*sin(pi*cos(pi*sin(pi*sin(pi*y))))*avg(avg(cos(pi*y) ,x),x)"));    
          
    }*/
}
