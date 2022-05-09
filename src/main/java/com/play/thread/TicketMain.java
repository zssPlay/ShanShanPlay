package com.play.thread;

public class TicketMain {
    public static void main(String[] args) {
        //1.创建任务
        Ticket t = new Ticket();
        //2.创建线程
        Thread m1 = new Thread(t);
        Thread m2 = new Thread(t);
        Thread m3 = new Thread(t);
        //3.启动线程
        m1.start();
        m2.start();
        m3.start();
        //数据出现a.重复数据 b.非法数据
    }
}
