/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

import java.awt.image.*;
import javax.swing.JFrame;

/**
 *
 * @author Tiia
 */
public class GUI extends BufferedImage {

    public GUI(int width, int height, int imageType) {
        super(width, height, imageType);
    }
    
    
    public void applyColor(){
        int height = getHeight();
        int width = getWidth();
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                //setPixel(x, y);
                this.setRGB(x,y,55);
                
            }
        }
        frame.setVisible(true);
    }
}
