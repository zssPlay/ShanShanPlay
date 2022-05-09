package com.play.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaDemo {
    public static void main(String[] args) {
       /* //1.使用匿名内部类来完成线程的创建
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/
        //2.使用lambda优化匿名内部类,而且必须是接口的匿名内部类,无法优化父类的抽象类的那种匿名内部类
        new Thread(()->{System.out.println(Thread.currentThread().getName()+"线程执行了...");}).start();

        //3.使用匿名内部类完成比较器排序
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        arr.add(2);
        arr.add(3);
      /*  //排序
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

//使用lambda来;优化上面的代码
        Collections.sort(arr,(Integer o1,Integer o2)->{return o2 - o1;});
        System.out.println(arr);
    }
}
