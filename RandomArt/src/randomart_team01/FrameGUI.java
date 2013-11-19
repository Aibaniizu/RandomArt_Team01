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
 * @author Chanidapa and Tiia
 * @version 19/11/2013
 */
public class FrameGUI extends JPanel{
    private GUI panel ;
    private JPanel down;
    private JPanel top;
    private JButton generateButton;
    private JButton functionButton;
    private JButton printString;
    private TextField text,text1,text2;

    
    ImageIcon imageFun = new ImageIcon("Function.jpg");
    ImageIcon imageGen = new ImageIcon("Generate.jpg");
    
    public FrameGUI() {
        
         setText();
         setLayout(new BorderLayout());
         panel = new GUI();
         
         add(panel,BorderLayout.CENTER);
         down = new JPanel();
         down.setLayout(new FlowLayout());
         down.add(generate());
         down.add(function());
         add(down,BorderLayout.SOUTH);
    
}   //set picture at center
    public void addGUI(){
        panel = new GUI();
        add(this.panel,BorderLayout.CENTER);
    }
    
    //set generate button
    public JButton generate(){
        generateButton = new JButton();
        generateButton.setSize(new Dimension(200,20));
        generateButton.setText("Generate");
        generateButton.add(new JLabel(imageGen));
        generateButton.addActionListener(new ActionListener(){
          
            public void actionPerformed(ActionEvent e){
             
                repaint();
            }

        });
        return generateButton;
    }
    
    //set function button
    public JButton function(){
        functionButton = new JButton();
        functionButton.setSize(new Dimension(200,20));
        functionButton.setText("Print Function");
        functionButton.add(new JLabel(imageFun));
        functionButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                JFrame show = new JFrame();
                show.setLayout(new GridLayout(3,1,1,1));
                show.add(text);
                show.add(text1);
                show.add(text2);
                show.setSize(900,150);
                text.setText("RED = "+ panel.printExpressionR());
                text1.setText("GREEN = "+ panel.printExpressionG());
                text2.setText("BLUE = "+ panel.printExpressionB());
             
                show.setVisible(true);
            }

        });
        return functionButton;
    }
    
    //set text for show each color
    public void setText(){
        text = new TextField();
        text1 = new TextField();
        text2 = new TextField();


    }
}
