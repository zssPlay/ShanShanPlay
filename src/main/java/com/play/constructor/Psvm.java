package com.play.constructor;

public class Psvm {
    public static void main(String[] args) {
        for (Spininess value : Spininess.values()) {
            System.out.println(value + ", ordinal"+ value.ordinal());
        }
    }
}
