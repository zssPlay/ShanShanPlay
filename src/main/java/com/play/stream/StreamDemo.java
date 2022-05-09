package com.play.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //获取流的方式
        //1.单列集合
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("abc");
        arr.add("cba");
        Stream<String> s1 = arr.stream();
        //2.数组
        //Integer[] nums = {10,20,30};
        Stream<Integer> s2 = Stream.of(10,20,30);//这里不可以使用int,stream中的泛型只能是引用类型
        //双列集合
        HashMap<String,Integer> map = new HashMap();
        map.put("赵伟奇",1);
        map.put("谢谢",2);
        Set<String> strings = map.keySet();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<String> s3 = map.keySet().stream();
        Stream<Map.Entry<String,Integer>> s=map.entrySet().stream();
    }
}

