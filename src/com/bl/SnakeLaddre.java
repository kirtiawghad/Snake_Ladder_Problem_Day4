package com.bl;

public class SnakeLaddre {

    int position = 0;

    public static void diaRoll(){
        int diavalue = (int)(Math.random()*10 % 6)+1;
        System.out.println(diavalue);
    }

    public static void play(){

        int number = (int)(Math.random()*10%3);
        System.out.println(number);
        switch (number){
            case 0:
                System.out.println("Not move the position of plyear");
                break;
            case 1:
                System.out.println("Ladder the player moves ahead");
                break;
            case 2:
                System.out.println("Snake the player moves behind");
        }
    }
    public static void main(String[] args) {

        diaRoll();
        play();

    }
}
