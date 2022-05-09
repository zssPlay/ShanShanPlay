package com.play.ademo;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);
        List<Object> list1 = new ArrayList<>();
        list1.add(0);list1.add(1);list1.add(2);list1.add(3);list1.add(4);
        for (Object o : list) {
            System.out.println("list执行了一次");
            for (Object o1 : list1) {
                System.out.println("list1执行了一次");
            }
        }
    }//外层循环执行10次,内层执行了50次 so:内层执行的次数是  : 外层执行次数* 内层执行次数
}
