/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

import javax.swing.JFrame;

/**
 *
 * @author erngg
 */
public class RandomArt_Team01 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame j = new JFrame();
        j.setTitle("RandomArt_Team01");
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.add(new GUI());
        j.setVisible(true);
        
    }
}
