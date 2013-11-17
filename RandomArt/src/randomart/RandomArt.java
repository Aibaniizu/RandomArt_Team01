/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package randomart;
//import java.awt.Canvas;
//import java.awt.Graphics;
//import javax.swing.JFrame;

/**
 * Main class that creates user interface
 * 
 * @author Tiia
 * @version 16/11/2013
 */

//public class RandomArt {
    //private static final int WIDTH = 200;
    //private static final int HEIGHT = 200;
  

/*
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        color.print(red,green,blue);
        for(int x = 0; x < WIDTH; x++) {
            for(int y = 0; y < HEIGHT; y++) {
                g.setColor(color.makeColor());
                g.drawLine(x, y, x, y);
                
            }
        }
    }*/
/*
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
}*/


package randomart;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;
/**
 * Main class that also creates the GUI
 * 
 * @author Tiia
 * @version 16/11/2013
 */
public class RandomArt extends Canvas{
    private final Random random = new Random(); 
    private final int pixelsPerUnit = 150;
    private int side;

    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Exp red = new Exp();
        Exp green = new Exp();
        Exp blue = new Exp();
        BufferedImage redPlane   = plotIntensity(red, "red");
        BufferedImage greenPlane = plotIntensity(green, "green");
        BufferedImage bluePlane  = plotIntensity(blue, "blue");
        
        BufferedImage combined = new BufferedImage(redPlane.getWidth(), redPlane.getWidth(), BufferedImage.TYPE_INT_ARGB);
    
        // merge layers
        g = combined.getGraphics();
        g.drawImage(redPlane, 0, 0, null);
        g.drawImage(greenPlane, 0, 0, null);
        g.drawImage(bluePlane, 0, 0, null);
        
        print(red,green,blue);
    }

    //cretes an image of single expression
    public BufferedImage plotIntensity(Exp exp,String str){
        
        side = 2 * pixelsPerUnit + 1;
        
        BufferedImage img = new BufferedImage(side,side,1);

        for(int px = 0; px < side; px++) {
            for(int py = 0; py < side; py++) {
                float x = (float)(px - pixelsPerUnit) / pixelsPerUnit;
                float y = -(float)(py - pixelsPerUnit) / pixelsPerUnit;
                
                //Eval e = new Eval(exp,x,y);
                float z = 1;//e;
                
                int intensity = (int)(Math.random()*255);//(int)(z * 127.5 + 127.5);
                switch (str) {
                    case "red":
                        img.setRGB(intensity,0,0);
                        break;
                    case "green":
                        img.setRGB(0,intensity,0);
                        break;
                    default:
                        img.setRGB(0,0,intensity);
                        break;
                }
            }
        }
        return img;
    }
    
    //merges images/layers created on plotIntensity method
    public BufferedImage plotColor(Exp redExp,Exp greenExp,Exp blueExp){
        
    BufferedImage redPlane   = plotIntensity(redExp, "red");
    BufferedImage greenPlane = plotIntensity(greenExp, "green");
    BufferedImage bluePlane  = plotIntensity(blueExp, "blue");
        
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
        System.out.println(redExp.getExpString());
        System.out.println(greenExp.getExpString());
        System.out.println(blueExp.getExpString());
        System.out.println("test");
    }
    
    public static void main(String[] args) {
        RandomArt gui = new RandomArt();
        JFrame frame = new JFrame();

        frame.setSize(gui.getSide(), gui.getSide()+200);
        frame.add(new RandomArt());

        frame.setVisible(true);
    }

}
