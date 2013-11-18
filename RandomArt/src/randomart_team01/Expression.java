/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomart_team01;

/**
 *
 * @author erngg
 */
public class Expression extends Random{
    
    private double random;
    private int level;
    private int randomFunc;
    private Random nextNode;
    private Random nextNode2;
    private int next;
    

     public Expression(int level, int random){
         this.level = level;
         this.randomFunc = random;
         next = (int)(Math.random()*3);
         random(level);
     }
     
     public void random(int level){
         if(level > 1){
             nextNode = new Expression(this.level-1, next);
             nextNode2 = new Expression(this.level-1, next);
         }
         else{
             int ran = (int) (Math.random()*2);
             nextNode = new InputXY(ran);
             nextNode2 = new InputXY(ran);
         }
     }
     
     //this method random function
     public double randomFunction(double x, double y){
         
         switch(randomFunc){
             case 0: 
                 random = Math.sin(Math.PI*nextNode.randomFunction(x,y));
                 break;
             case 1: 
                 random = Math.cos(Math.PI*nextNode.randomFunction(x,y));
                 break;
             case 2: 
                 random =  ((nextNode.randomFunction(x,y)) + (nextNode2.randomFunction(x,y)) )/2;
                 //System.out.println("xxx");
                 break;
             default:
                 random = 0;
                 break;
         }
         return random;
     }
     
     /*public double average(double x, double y){
         return ((nextNode.randomFunction(x,y)) + (nextNode.randomFunction(x,y)) )/2;
     }*/
     
     public String expression(){
         
         String word;
         switch(randomFunc){
             case 0: 
                 word = "sin(" + nextNode.expression()+ ")" ; 
                 break;
             case 1:
                 word = "cos(" + nextNode.expression()+ ")" ; 
                 break;
             case 2:
                 word = "avg(" + nextNode.expression() + ","+ nextNode.expression() + ")"; 
                 break;
             default:
                 word = "";
                 break;
         }
         return word;
     }
}
