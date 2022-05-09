package com.play.thread;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);//定长的线程池
        //提交任务100次
       /* for (int i = 0; i < 100; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }*/
       Future<Integer> future=executorService.submit(new Callable<Integer>() {//future 将来
           @Override
           public Integer call() throws Exception {
               int sum = 0;
               for (int i = 1; i < 101; i++) {
                   sum += i;
               }
               return sum;
           }
       });
        System.out.println(future.get());//从将来对象中获取结果
        //关闭线程池
        executorService.shutdown();
    }
}
