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
        
        private double x;
        private double y;
        private int count = 0;
        private int level = 5;
        private String expressionString = "";
        
         public Exp(double x, double y){
             this.x = x;
             this.y = y;
             
         }
         
         public double evaluate(boolean closeBrack){
             int random;
              if(this.count == 0){
                  random = (int) (Math.random()*2);
                  this.count++;
              }else if(this.count < this.level){
                  random = (int) (Math.random()*3);
                  this.count++;
              }else{
                  random = (int) (Math.random()*4);
                  this.count++;
              }
              
               switch(random){
                   case 0: 
                       expressionString += "sin(pi*";
                       return Math.sin(Math.PI*evaluate(true));
                       
                   case 1:
                       expressionString += "cos(pi*";
                       return Math.cos(Math.PI*evaluate(true));
                       
                   case 2:
                       expressionString += "avg(";
   
                       double first = evaluate(false);
                       expressionString += ",";
                       double second = evaluate(true);
                       expressionString += ")";
                       return avg(first, second);
                   case 3: 
                       if(closeBrack == true){
                           expressionString += "x)";
                       }else{
                           expressionString += "x";
                       }
                       
                       return x;
                       
                   default:
                       if(closeBrack == true){
                           expressionString += "y)";
                       }else{
                           expressionString += "y";
                       }
                       return y;
                       
               }
         }
         
         public double avg(double x, double y){
             return (x+y)/2;
         }
         
         public String printExp(){
             int countOpen = 0;
             int countClose = 0;
             
             for(int i = 0; i < expressionString.length(); i++){
                 if(expressionString.charAt(i) == '(' ){
                     countOpen++;
                 }else if(expressionString.charAt(i) == ')'){
                     countClose++;
                 }
             
             }
             
             for(int i = 0; i < countOpen - countClose; i++){
                 expressionString += ")";
             }
             
             return expressionString;
         }
         
       
         
         public static void main(String[] args){
             Exp red = new Exp(12.0, 12.1);
             System.out.println(red.evaluate(true));
             System.out.println(red.printExp());
             //System.out.println((int)Math.random()*2);
             
         }
    }
        
