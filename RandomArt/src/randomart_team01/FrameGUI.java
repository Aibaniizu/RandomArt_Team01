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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author erngg
 * @version 
 */
public class FrameGUI extends JFrame{
    public GUI panel ;
    private JPanel down;
    private JPanel top;
    private JButton generateButton;
    private JButton functionButton;
    private JButton printString;
    
    ImageIcon imageFun = new ImageIcon("Function.jpg");
    ImageIcon imageGen = new ImageIcon("Generate.jpg");
    
    public FrameGUI() {
        
        setLayout(new BorderLayout());
        panel = new GUI();
        add(this.panel,BorderLayout.CENTER);
    
        down = new JPanel();
        down.setLayout(new FlowLayout());
        down.add(generate());
        down.add(function());
        add(down,BorderLayout.SOUTH);
        
    
//    top = new JPanel();
//    top.setLayout(new GridLayout(1,1));
//    top.add(printString());
//    add(top,BorderLayout.NORTH);
    
}
    public JButton generate(){
        generateButton = new JButton();
        generateButton.setSize(new Dimension(200,20));
        generateButton.setText("Generate");
        generateButton.add(new JLabel(imageGen));
        generateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                GUI generate = new GUI();
                generate.setShowPicture();
                repaint();
            }
        });
        return generateButton;
    }
    
    public JButton function(){
        functionButton = new JButton();
        functionButton.setSize(new Dimension(200,20));
        functionButton.setText("function");
        functionButton.add(new JLabel(imageFun));
        functionButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //FrameGUI temp = new FrameGUI();
                /*Expression red = new Expression();
                Expression green = new Expression();
                Expression blue = new Expression();
                System.out.println("red : " + red.expression());
                System.out.println("green : " + green.expression());
                System.out.println("blue : " + blue.expression());*/
                panel.printExpression();
            }
        });
        return functionButton;
    }
    
    public JButton printString(){
        printString = new JButton();
        printString.setSize(50, 50);
        return printString;
    }
}
