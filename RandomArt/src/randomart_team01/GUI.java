/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author erngg
 */
public class GUI extends JPanel{
    private Expression red,green,blue;
    
    public GUI(){
        setShowPicture();
        repaint();
    }
    
    public void setShowPicture(){
        int level = (int)(Math.random()*9+4);
        int random = (int)(Math.random()*3);
        
        red = new Expression(level, random); 
        green = new Expression(level, random);
        blue = new Expression(level, random);
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paint(g);
        
    }
    
    public void paint(Graphics g){
        
      for(int i=0;i<getHeight();i++){
        for(int j=0;j<getWidth();j++){
            
            //for size -1 to 1
            double x = ((((double) j) / getWidth()) * 2.0) - 1.0;
            double y = ((((double) i) / getHeight()) * 2.0) - 1.0;
            
            double redExp =   red.randomFunction(x,y);
            double greenExp = green.randomFunction(x,y);
            double blueExp =  blue.randomFunction(x,y);
            
            // before plus 1, the result is 1. ..
            // after plus 1,make it <= 1
            g.setColor(new Color( (int)((redExp+1)*255/2), (int)((greenExp+1)*255/2), (int)((blueExp+1)*255/2)));
            g.fillRect(j, i, 1, 1);
            
        }
      }
       
    }
    
}
