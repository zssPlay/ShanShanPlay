package com.play.workdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String item : list) {
            if ("2".equals(item))
                list.remove(item);
        }
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if ("2".equals(item)){
                iterator.remove();
            }
        }
        System.out.println(list1);
    }
    //简单总结一下，之所以会抛出ConcurrentModificationException异常，
    // 是因为我们的代码中使用了增强for循环，而在增强for循环中，集合遍历是通过iterator进行的，
    // 但是元素的add/remove却是直接使用的集合类自己的方法。这就导致iterator在遍历的时候，
    // 会发现有一个元素在自己不知不觉的情况下就被删除/添加了，就会抛出一个异常，用来提示用户，可能发生了并发修改！

}
