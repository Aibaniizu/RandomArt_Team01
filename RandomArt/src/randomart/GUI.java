/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;
/**
 *
 * @author Tiia
 * @version 16/11/2013
 */
public class GUI extends Canvas{
    private Random random; 
    private int pixelsPerUnit;
    private int side;
    
    

    public GUI() {
        random = new Random();
        pixelsPerUnit = 150;
        
    }

    //cretes an image of single expression
    public BufferedImage plotIntensity(Exp exp){
        
        side = 2 * pixelsPerUnit + 1;
        
        BufferedImage img = new BufferedImage(side,side,1);

        for(int px = 0; px < side; px++) {
            for(int py = 0; py < side; py++) {
                float x = (float)(px - pixelsPerUnit) / pixelsPerUnit;
                float y = -(float)(py - pixelsPerUnit) / pixelsPerUnit;
                
                Eval e = new Eval(exp,x,y);
                int z = e;
                
                int intensity = (int)(z * 127.5 + 127.5);
                 
                img.setRGB(px, py, intensity);
            }
        }
        return img;
    }
    
    //merges images/layers created on plotIntensity method
    public BufferedImage plotColor(Exp redExp,Exp greenExp,Exp blueExp){
        
    BufferedImage redPlane   = plotIntensity(redExp);
    BufferedImage greenPlane = plotIntensity(greenExp);
    BufferedImage bluePlane  = plotIntensity(blueExp);
        
    BufferedImage combined = new BufferedImage(redPlane.getWidth(), redPlane.getWidth(), BufferedImage.TYPE_INT_ARGB);

        // merge layers
        Graphics g = combined.getGraphics();
        g.drawImage(redPlane, 0, 0, null);
        g.drawImage(greenPlane, 0, 0, null);
        g.drawImage(bluePlane, 0, 0, null);
        
        
        return combined;
    }
    public int getSide(){
        return side;
    }
    public Color makeColor(/*Exp redExp,Exp greenExp,Exp blueExp*/){
    //redExp.buildExp();
    //greenExp.buildExp();
    //blueExp.buildExp();
    return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    
    
    public void print(Exp redExp,Exp greenExp,Exp blueExp){
        System.out.println(redExp.getExpStr());
        System.out.println(greenExp.getExpStr());
        System.out.println(blueExp.getExpStr());
    }
    
    public static void main(String[] args) {
        GUI gui = new GUI();
        Exp red = new Exp();
        Exp green = new Exp();
        Exp blue = new Exp();
        
        gui.print(red,green,blue);
        
        JFrame frame = new JFrame();

        frame.setSize(gui.getSide(), gui.getSide()+200);
        frame.add(new GUI());

        frame.setVisible(true);
    }

}
