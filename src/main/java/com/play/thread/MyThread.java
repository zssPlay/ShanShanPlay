package com.play.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            //任务1 : 吃饭
            System.out.println("吃饭" + i);
        }
    }
}
