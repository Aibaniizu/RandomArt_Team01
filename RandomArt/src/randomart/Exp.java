/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.util.Random;

/**
 *
 * @author Chanidapa 55130500210
 */
public class Exp {
    private int count;

    public Exp() {
        this.count = 0;
    }
    
    
    //random x,y
    public void xy(){
        
    }
    
    //random function
    public String[] randomFunc(){
        String[] func = null;
        //func = {"sin", "cos", "avg"};
        Random function = new Random();
        int select = function.nextInt(func.length);
        return func;
    }
    
    //check case
    public void checkCase(){
        /*switch(select){
            case "sin": System.out.println("sin");
                break;
            case "cos": System.out.println("cos");
                break;
            case "avg"
        }*/
    }
    
    //average
    public void avg(){
        String[] temp;
        temp = randomFunc();
        char braces;
        braces = (char) checkBraces();
        System.out.println(temp + "(pi*" + braces);
    }
    
    //count braces
    public int checkBraces(){
        String i = "(";
        count++;
        return count;
    }

    private Eval obj;
    private Eval eval;
    ScriptEngineManager factory = new ScriptEngineManager();
    // create a JavaScript engine
    ScriptEngine engine = factory.getEngineByName("JavaScript");
    // evaluate JavaScript code from String
    //Eval obj = engine.eval("1+2");
    //System.out.println( obj );
    
    //should buildExp(); method be on this class?
}
