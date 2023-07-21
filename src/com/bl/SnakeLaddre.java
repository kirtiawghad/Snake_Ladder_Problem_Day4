package com.bl;

public class SnakeLaddre {

    public static final int  WIN_POSITION = 100;
   public static int POSITION = 0;
     static int diacount = 0;
     static int diaRoll(){
        int diavalue = (int)(Math.random()*10 % 6)+1;
         System.out.println("DIAVALUE =" + diavalue);
        return diavalue;
    }

    public static void play(){

       while (POSITION < WIN_POSITION){

           int number = (int)(Math.random()*10%3);
           System.out.println("choice :" + number);
           int diavalue = diaRoll();
           switch (number){
               case 0:
                   System.out.println("No Play");
                   break;
               case 1:
                   diacount++;
                   POSITION = POSITION + diavalue;
                   if (POSITION > WIN_POSITION){
                       POSITION = POSITION - diavalue;
                   }
                   System.out.println(POSITION);
                   break;
               case 2:
                   diacount++;
                   POSITION = POSITION - diavalue;
                   if (POSITION < 0){
                       POSITION = 0;
                   }
                   System.out.println(POSITION);
                   break;
               default:{
                   System.out.println("INVALID");
               }
               break;
           }
           System.out.println("Dice count = " + diacount);
       }
    }

    public static void main(String[] args) {

        SnakeLaddre obj = new SnakeLaddre();
        diaRoll();
        play();

    }
}
