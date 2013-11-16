    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

 package randomart;




import java.util.LinkedList;




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
        private LinkedList<Integer> stage;
        
         public Exp(){
             this.stage = new LinkedList<>();
         }
        
         public void setXY(double x, double y){
             this.x = x;
             this.y = y;
//             System.out.println("In Method SetXY");
//             System.out.println(this.x);
//             System.out.println(this.y);
         }
         
         
         public String getExpString(){
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
         
         public LinkedList<Integer> getStage(){
             LinkedList<Integer> copyStage = (LinkedList<Integer>)this.stage.clone();
             return copyStage;
         }
               
         public double genExp(boolean closeBrack){
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
                       this.stage.add(0);
                       return Math.sin(Math.PI*genExp(true));
                       
                   case 1:
                       expressionString += "cos(pi*";
                       this.stage.add(1);
                       return Math.cos(Math.PI*genExp(true));
                       
                   case 2:
                       expressionString += "avg(";
                       this.stage.add(2);
                       double first = genExp(false);
                       expressionString += ",";
                       double second = genExp(true);
                       expressionString += ")";
                       return avg(first, second);
                   case 3: 
                       this.stage.add(3);
                       if(closeBrack == true){
                           expressionString += "x)";
                       }else{
                           expressionString += "x";
                       }
                       
                       return x;
                       
                   default:
                       this.stage.add(4);
                       if(closeBrack == true){
                           expressionString += "y)";
                       }else{
                           expressionString += "y";
                       }
                       return y;
                       
               }
         }
         
         public double avg(double x, double y){
             return (x+y)/2.0;
         }
         
         public double computeExp(boolean closeBrack, LinkedList<Integer> stage){
                              
               int stageCase = stage.removeFirst();
               
               switch(stageCase){
                   case 0: 
                       expressionString += "sin(pi*";
                       //this.stage.add(0);
                       return Math.sin(Math.PI*computeExp(true, stage));
                       
                   case 1:
                       expressionString += "cos(pi*";
                       //this.stage.add(1);
                       return Math.cos(Math.PI*computeExp(true, stage));
                       
                   case 2:
                       expressionString += "avg(";
                       //this.stage.add(2);
                       double first = computeExp(false, stage);
                       expressionString += ",";
                       double second = computeExp(true, stage);
                       expressionString += ")";
                       return avg(first, second);
                   case 3: 
                       //this.stage.add(3);
                       if(closeBrack == true){
                           expressionString += "x)";                           
                       }else{
                           expressionString += "x";
                       }
                       
                       return x;
                       
                   default:
                       //this.stage.add(4);
                       if(closeBrack == true){
                           expressionString += "y)";
                       }else{
                           expressionString += "y";
                       }
                       return y;
                       
               }
         
         }
         
       
         
//         public static void main(String[] args) throws Exception{
//            Exp redExp = new Exp();
//            redExp.setXY(12.3, 20.5);
//            System.out.println(redExp.genExp(true));
//            System.out.println(redExp.getExpString());
//            LinkedList dump = redExp.getStage();
//            System.out.println(dump);
//            //redExp.setXY(12.3, 20.5);
//            System.out.println(redExp.computeExp(true));
//             System.out.println(redExp.getExpString());
//            
//         }
    }
        
