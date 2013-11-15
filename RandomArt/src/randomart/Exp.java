/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randomart;

/**
 *
 * @author Chanidapa 55130500210
 */
public class Exp {
    
    
    public static void main(String[] args){
        
        String temp = ""; 
        for(int i = 0; i <= 4; i++){
            
            int a = 2;
            double b = Math.random();
            int value = (int)(a*b);
            switch(value){
                case 0: 
                    temp += "sin(pi*";
                    break;
                default: 
                    temp +=  "cos(pi*";
                    break;
                /*default: 
                    temp = "dummy";
                    break;*/
            }
            
        }
        System.out.println(temp);
        
    }
}
