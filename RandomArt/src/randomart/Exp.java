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

        public Exp(){
            this.temp = "";
        }
        
        public void expr(){
            
            for(int i = 0; i <= 5; i++){
               
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
                        temp += "sin(pi*";
                        break;
                    case 1:
                        temp += "cos(pi*";
                        break;
                    case 2: 
                        temp += "avg(";
                        average();
                        break;
                    case 3: 
                        temp += "x";
                        break;
                    default: 
                        temp += "y";
                        break;
                }
            }
            System.out.println(temp);    
        }
        
        public void average(){
            String tempAvg = "";
            int count = 0;
            count = (int)Math.round(Math.random()*5);
            
            switch(count){
                case 0: tempAvg += "xa";
                    break;
                case 1: tempAvg += "ya";
                    break;
                case 2: tempAvg += "sin(pi*a";
                    break;
                case 3: tempAvg += "cos(pi*a";
                    break;
                default: tempAvg += "avg(a";
                    break;
            }
            System.out.println(tempAvg); 
        }
        
        public static void main(String[] args){
            Exp temp = new Exp();
            temp.expr();
       
        }
    }
