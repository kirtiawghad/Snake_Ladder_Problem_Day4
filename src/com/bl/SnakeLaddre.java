package com.bl;

public class SnakeLaddre {

    int position = 0;

    public static void diaRoll(){
        int diavalue = (int)(Math.random()*10 % 6)+1;
        System.out.println(diavalue);
    }
    public static void main(String[] args) {

        diaRoll();

    }
}
