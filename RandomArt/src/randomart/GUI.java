/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
/**
 *
 * @author Tiia
 */
public class GUI extends BufferedImage{
    private int intensity;
    private Random random = new Random(); 
    private int pixelsPerUnit; 
    
    private Exp redExp = new Exp();
    private Exp greenExp = new Exp();
    private Exp blueExp = new Exp();

    public GUI(int width, int height, int imageType) {
        super(width, height, imageType);
        pixelsPerUnit = 150;
    }
    
    public void setPixel(int x, int y, Color col)
    {
        int pixel = col.getRGB();
        setRGB(x, y, pixel);
    }
    
    public Color getPixel(int x, int y)
    {
        return new Color(getRGB(x, y));
    }
    
    public BufferedImage plotIntensity(/*exp,*/){
        
        //int height = 2 * pixelsPerUnit + 1;
        int width = 2 * pixelsPerUnit + 1;
        
        BufferedImage img = new BufferedImage(width,width,1);

        for(int px = 0; px < width; px++) {
            for(int py = 0; py < width; py++) {
                float x = (float)(px - pixelsPerUnit) / pixelsPerUnit;
                float y = -(float)(py - pixelsPerUnit) / pixelsPerUnit;
                int z = evalExpr(exp,x,y);
                intensity = int(z * 127.5 + 127.5);
                 
                img.setRGB(px, py, intensity);
            }
        }
        return img;
    }
    
    public BufferedImage plotColor(redExp,greenExp,blueExp, pixelsPerUnit){
        
    BufferedImage redPlane   = plotIntensity(redExp, pixelsPerUnit);
    BufferedImage greenPlane = plotIntensity(greenExp, pixelsPerUnit);
    BufferedImage bluePlane  = plotIntensity(blueExp, pixelsPerUnit);
        
    BufferedImage combined = new BufferedImage(redPlane.getWidth(), redPlane.getWidth(), BufferedImage.TYPE_INT_ARGB);

        // paint both images, preserving the alpha channels
        Graphics g = combined.getGraphics();
        g.drawImage(redPlane, 0, 0, null);
        g.drawImage(greenPlane, 0, 0, null);
        g.drawImage(bluePlane, 0, 0, null);
        
        return combined;
    }
    
    public void makeColor(/*redExp,greenExp,blueExp, pixelsPerUnit*/){
    //redExp.buildExp();
    //greenExp.buildExp();
    //blueExp.buildExp();
    
    }

}
