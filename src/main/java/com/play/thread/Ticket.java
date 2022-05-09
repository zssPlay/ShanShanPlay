package com.play.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 买票任务
 */
public class Ticket implements Runnable {

    int count = 100;
    Object obj = new Object();
    /*@Override //解决方案一: 同步代码块
    public void run() {
        while (true){
            synchronized(obj){
                if (count>0){
                    System.out.println("卖出第"+count+"张票");
                    count--;
                }
            }
        }
    }*/
    /*@Override  //解决方案二: 同步方法
    public void run() {
        while (true){
            show();
        }
    }
    //同步方法注意:同步方法,也是需要锁对象的,只是锁对象不需要程序员自己提供
    //         如果同步方法是成员方法,那么默认使用this作为锁对象
    //         如果同步方法是静态方法,那么默认使用当前类字节码文件作为锁对象
    public synchronized void show(){
        if (count>0){
            System.out.println("卖出第"+count+"张票");
            count--;
        }
    }*/
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //加锁
            lock.lock();
            if (count>0){
                System.out.println("卖出第"+count+"张票");
                count--;
            }
            //解锁
            lock.unlock();
        }
    }
}
//解决方案总结:
//同步代码块和同步方法,底层的逻辑类似,都是通过锁对象来完成,同步代码块的锁对象是我们提供的,同步方法的锁对象是默认的!
// Lock锁,这种方式更加面向对象,通过对象调用方法来完成加锁和解锁的!
