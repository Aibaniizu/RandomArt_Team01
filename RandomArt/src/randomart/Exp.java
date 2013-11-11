/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;
import javax.script.*;
/**
 *
 * @author Chanidapa
 */
public class Exp {
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
