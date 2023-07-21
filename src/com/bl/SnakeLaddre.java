package com.bl;

public class SnakeLaddre {

   public static int POSITION = 0;

     static int diaRoll(){
        int diavalue = (int)(Math.random()*10 % 6)+1;
         System.out.println(diavalue);
        return diavalue;
    }

    public static void play(){

       while (POSITION < 100){

           int number = (int)(Math.random()*10%3);
           int diavalue = diaRoll();
           switch (number){
               case 0:
                   System.out.println("Not move the position of plyear");
                   break;
               case 1:
                   System.out.println("Ladder the player moves ahead");
                   POSITION = POSITION + diavalue;
                   break;
               case 2:
                   System.out.println("Snake the player moves behind");
                   POSITION = POSITION - diavalue;

               default:{
                   System.out.println("other option");
               }
           }
           System.out.println("position is :" + " "+ POSITION);
       }
    }

    void winplay(){

         int winposition = 100;
    }
    public static void main(String[] args) {

        SnakeLaddre obj = new SnakeLaddre();
        diaRoll();
        play();

    }
}
