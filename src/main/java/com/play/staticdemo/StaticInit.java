package com.play.staticdemo;

public class StaticInit {
    public static void main(String[] args) {
        System.out.println("Create new Cupboard() in the main ");
        new Cupboard();
        System.out.println("Create new Cupboard() in the main ");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
//初始化顺序: 先静态对象 后非静态对象
//无论创建多少个对象,静态数据都占用一份存储空间,static关键字不可以应用于局部变量,因此它只能作用于域
//如果域是一个基本类型域,且未初始化那么就会获得基本类型的标准初值,如果它是个对象引用,那么他的默认初始化就是null
