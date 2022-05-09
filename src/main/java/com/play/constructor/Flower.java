package com.play.constructor;

public class Flower {
    Flower (int i){
        System.out.println("花长"+ i+"厘米");
    }
    Flower (char x,int i){
        this(i);
        System.out.println("花色"+x);
    }

    public static void main(String[] args) {
        Flower flower = new Flower('红',1);
        System.out.println(flower);
    }
}
