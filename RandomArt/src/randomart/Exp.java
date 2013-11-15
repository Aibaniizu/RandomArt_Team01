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
        private String temp;
        private int currentIndex;
        public Exp(){
            this.temp = "";
            this.currentIndex = 0;
        }
        
        public void expr(){
            
            for(int i = 0; i <= 8; i++){
               
                int value = 1;
                
                if(i < 2){
                   value = (int) Math.round(Math.random()*2);
                }
                else{
                    double a = Math.random()*5;
                    value = (int)(a);
                }

                switch(value){
                    case 0:
                        this.temp += "sin(pi*";
                        
                        break;
                    case 1:
                        this.temp += "cos(pi*";
                        
                        break;
                    case 2: 
                        this.temp += "avg(";
                        average();
                        this.temp += ")";
                        break;
                    case 3: 
                        this.temp += "x";
                        countBracket();
                        break;
                    default: 
                        this.temp += "y";
                        countBracket();
                        break;
                }
            }
            System.out.println(this.temp);
            System.out.println(this.temp.length());
        }
        
        //average method
        public void average(){
    
            int count = 0;
            count = (int)Math.round(Math.random()*5);
            
            switch(count){
                case 0: this.temp += "xa ";
                    break;
                case 1: this.temp += "ya ";
                    break;
                case 2: this.temp += "sin(pi*a) ";
   
                    break;
                case 3: this.temp += "cos(pi*a) ";
                    
                    break;
                default: this.temp += "avg(a ";
                    average();
                    temp += ")";
                    break;
            }
            this.temp += ",";
            
            int count2 = 0;
            switch(count2){
                case 0: this.temp += "xb ";
                    break;
                case 1: this.temp += "yb ";
                    break;
                case 2: this.temp += "sin(pi*b ";
                    break;
                default: this.temp += "cos(pi*b ";
                    break;
            }
        }
        
        
        public void countBracket(){
            System.out.println("Current Index = " + this.currentIndex);
            System.out.println("Content = " + this.temp);
            System.out.println("Current length = " + this.temp.length());
            int count = 0;
            for(int i = this.currentIndex; i < this.temp.length(); i++){
                if(this.temp.charAt(i) == '(' && this.temp.charAt(i-1) != 'g'){
                    count += 1;
                }
                this.currentIndex = i;
            }
            for(int i = 0; i < count; i++){
                this.temp += ")";
            }
            System.out.println(this.temp);
            System.out.println("Current Index after count = " + this.currentIndex);
            System.out.println("Count = " + count);
            
        }
        public static void main(String[] args){
            Exp temp = new Exp();
            temp.expr();
       
        }
    }
