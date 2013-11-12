/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;
/**
 *
 * @author Tiia
 */
public class GUI extends BufferedImage{
    private int intensity;
    private Random random = new Random(); 
    
    private Exp redExp = new Exp();
    private Exp greenExp = new Exp();
    private Exp blueExp = new Exp();
    private BufferedImage rI = new BufferedImage(200,200,1);
    private BufferedImage gI = new BufferedImage(200,200,1);
    private BufferedImage bI = new BufferedImage(200,200,1);

    public GUI(int width, int height, int imageType) {
        super(width, height, imageType);
    }
    
    public void plotIntensity(/*exp, pixelsPerUnit*/){
        //intensity = ??;
        
        int height = getHeight();
        int width = getWidth();
        
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                
                Color temp = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                
                setRGB(x,y, temp);
            }
        }
    }
    
    public void plotColor(/*redExp,greenExp,blueExp, pixelsPerUnit*/){
    //redPlane   = plotIntensity(redExp, pixelsPerUnit);
    //greenPlane = plotIntensity(greenExp, pixelsPerUnit);
    //bluePlane  = plotIntensity(blueExp, pixelsPerUnit);
        int height = getHeight();
        int width = getWidth();
        
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                Color tempRed = new Color(redPlane.getRed(x,y));
                Color tempGreen = new Color(greenPlane.getGreen(x,y));
                Color tempBlue = new Color(bluePlane.getBlue(x,y));
                
                Color temp = new Color(tempRed,tempGreen,tempBlue);
                
                setRGB(x,y, temp);
            }
        }
    }
    
    public Color makeColor(/*redExp,greenExp,blueExp, pixelsPerUnit*/){
    //redExp.buildExp();
    //greenExp.buildExp();
    //blueExp.buildExp();
        //return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}
