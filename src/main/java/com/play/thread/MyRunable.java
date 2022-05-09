package com.play.thread;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("跳舞" + i);
        }
    }
}
