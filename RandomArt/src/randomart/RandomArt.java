/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;


/**
 *
 * @author Tiia
 */

public class RandomArt extends Canvas {
    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;
    private static final Random random = new Random();
    
    private int intensity;
    private Exp redExp = new Exp();
    private Exp greenExp = new Exp();
    private Exp blueExp = new Exp();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int x = 0; x < WIDTH; x++) {
            for(int y = 0; y < HEIGHT; y++) {
                g.setColor(randomColor());
                g.drawLine(x, y, x, y);
                
            }
        }
    }

    private Color randomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    
    
    public void plotIntensity(/*exp, pixelsPerUnit*/){
        //intensity = ??;
    }
    
    public void plotColor(/*redExp, greenExp, blueExp, pixelsPerUnit*/){
    //redPlane   = plotIntensity(redExp, pixelsPerUnit);
    //greenPlane = plotIntensity(greenExp, pixelsPerUnit);
    //bluePlane  = plotIntensity(blueExp, pixelsPerUnit);
    }
    
    public void makeColor(){
    //redExp   = buildExp();
    //greenExp = buildExp();
    //blueExp  = buildExp();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(WIDTH, HEIGHT);
        frame.add(new RandomArt());

        frame.setVisible(true);
    }
}
