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
    private GUI rI = new GUI(200,200,1);
    private GUI gI = new GUI(200,200,1);
    private GUI bI = new GUI(200,200,1);

    public GUI(int width, int height, int imageType) {
        super(width, height, imageType);
    }
    
    public void setPixel(int x, int y, Color col)
    {
        int pixel = col.getRGB();
        setRGB(x, y, pixel);
    }
    
    public Color getPixel(int x, int y)
    {
        int pixel = getRGB(x, y);
        return new Color(pixel);
    }
    
    public void plotIntensity(/*exp, pixelsPerUnit*/){
        //intensity = ??;
        
        int height = getHeight();
        int width = getWidth();
        
        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {
                
                setPixel(x, y, getPixel(x, y));
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
                
                Color tempColor = new Color(rI.getRed(x,y),gI.getGreen(x,y),bI.getBlue(x,y));
                
                setRGB(x,y, tempColor);
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


    private void setRGB(int x, int y, Color temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getRed(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getGreen(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getBlue(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
