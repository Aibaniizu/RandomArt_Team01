/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 * A Class that creates the shown image and prints the expressions used
 * 
 * @author Chanidapa and Tiia
 * @version 18/11/2013
 */
public class GUI extends JPanel{
    private Expression red,green,blue;
    
    public GUI(){
        
        
        setShowPicture();
        repaint();
        setButton();
    }
    
    //set show pictuer
    public void setShowPicture(){
        int level = (int)(Math.random()*9+4);
        int random = (int)(Math.random()*3);
        
        red = new Expression(level, random); 
        green = new Expression(level, random);
        blue = new Expression(level, random);
    }
    
    //set button
    public void setButton(){
        JButton button = new JButton(" ");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                repaint();
            }
        });
    }
    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        paint(g);
        
    }
    
    public void paint(Graphics g){
        setShowPicture();
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
    
    // print function each color
    public String printExpressionR(){ 
        return red.expression();
    }
    public String printExpressionG(){
        return green.expression();
    }
    public String printExpressionB(){
        return blue.expression();
    }
    
}
