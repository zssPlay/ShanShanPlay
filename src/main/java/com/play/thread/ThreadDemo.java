package com.play.thread;

public class ThreadDemo  {
    public static void main(String[] args) throws InterruptedException {//虚拟机开启主线程
        //匿名内部类可以快速的创建一个类的子类对象和实现类对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.out.println("线程名字"+ getName());
                    System.out.println("吃屎" + i);
                }
            }
        }.start();
        new Thread(new Runnable() {//这里只是实现,并不是子类,没有getName方法
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.out.println("线程名字"+ Thread.currentThread().getName());
                    System.out.println("喝尿" + i);
                }
            }
        }).start();
        for (int i = 0; i < 300; i++) {
            //任务2 : 听歌
            System.out.println("抽烟" + i);
            System.out.println("线程名字"+ Thread.currentThread().getName());
            //Thread.sleep(1000);
        }
    }
}
