package com.play.staticdemo;

public class StaticBlock {
    static  int i;
    static {
        i = 47;
    }
}
//java允许将多个静态初始化的动作组成一个特殊的静态代码块,这段代码仅执行一次:当首次生成这个类的一个对象时,
//或者首次访问属于那个类的静态数据成员时(即使从未生成过那个类的对象)
