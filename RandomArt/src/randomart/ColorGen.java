/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import java.awt.Color;
import java.util.Random;



/**
 * ColorGen is a class that generates color values
 * 
 * @author Tiia
 */
public class ColorGen {

    private int intensity;
    private Random random = new Random(); 
    
    private Exp redExp = new Exp();
    private Exp greenExp = new Exp();
    private Exp blueExp = new Exp();
    
    public ColorGen() {
        
        
    }
    
    public void plotIntensity(/*exp, pixelsPerUnit*/){
        //intensity = ??;
    }
    
    public void plotColor(/*redExp,greenExp,blueExp, pixelsPerUnit*/){
    //redPlane   = plotIntensity(redExp, pixelsPerUnit);
    //greenPlane = plotIntensity(greenExp, pixelsPerUnit);
    //bluePlane  = plotIntensity(blueExp, pixelsPerUnit);
    }
    
    public Color makeColor(/*redExp,greenExp,blueExp, pixelsPerUnit*/){
    //redExp.buildExp();
    //greenExp.buildExp();
    //blueExp.buildExp();
        //return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

}
