/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author erngg
 * @version 
 */
public class FrameGUI extends JFrame{
    private GUI panel;
    private JPanel down;
    private JButton generateButton;
    private JButton functionButton;
    
    public FrameGUI() {
    setLayout(new BorderLayout());
    panel = new GUI();
    add(panel,BorderLayout.CENTER);
    
    down = new JPanel();
    down.setLayout(new FlowLayout());
    down.add(generate());
    down.add(function());
    add(down,BorderLayout.SOUTH);
    
    
}
    public JButton generate(){
        generateButton = new JButton();
        generateButton.setSize(new Dimension(200,20));
        generateButton.setText("Generate");
        return generateButton;
    }
    public JButton function(){
        functionButton = new JButton();
        functionButton.setSize(new Dimension(200,20));
        functionButton.setText("function");
        return functionButton;
    }
}
