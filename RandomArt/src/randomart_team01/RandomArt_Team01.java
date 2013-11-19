/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Main Class
 * 
 * @author erngg
 * @version 18/11/2013
 */
public class RandomArt_Team01 extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        FrameGUI j = new FrameGUI();
        JFrame frame = new JFrame();
        frame.setTitle("Random_Team01");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(j);
        frame.setVisible(true);
        
    }
}
