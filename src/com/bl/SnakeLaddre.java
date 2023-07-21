package com.bl;

public class SnakeLaddre {

    public static final int  WIN_POSITION = 100;
   public static int POSITION = 0;

     static int diaRoll(){
        int diavalue = (int)(Math.random()*10 % 6)+1;
         System.out.println("DIAVALUE =" + diavalue);
        return diavalue;
    }

    public static void play(){

       while (POSITION < WIN_POSITION){

           int number = (int)(Math.random()*10%3);
           int diavalue = diaRoll();
           switch (number){
               case 0:
                   System.out.println("Not move the position of plyear");
                   break;
               case 1:
                   System.out.println("Ladder the player moves ahead");
                   POSITION = POSITION + diavalue;
                   if (POSITION > WIN_POSITION){
                       POSITION = POSITION - diavalue;
                   }
                   System.out.println(POSITION);
                   break;
               case 2:
                   System.out.println("Snake the player moves behind");
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

       }
    }

    public static void main(String[] args) {

        SnakeLaddre obj = new SnakeLaddre();
        diaRoll();
        play();

    }
}
