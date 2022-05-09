package com.play.reflect;
/*
反射
 */
public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> reflect = Class.forName("com.play.reflect.Reflect");//最安全,最常用,性能最好
        System.out.println(reflect);
        System.out.println(reflect);
        System.out.println(reflect);
    }
}
