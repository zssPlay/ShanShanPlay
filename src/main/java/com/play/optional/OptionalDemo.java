package com.play.optional;

import java.util.Optional;
/*
optional 类是一个可以为 null 的容器对象。如果值存在则 isPresent()方法会返 回 true，调用 get()方法会返回该对象。
 */
public class OptionalDemo {
    public static void main(String[] args) {
        String s = new String("abc");
        Optional<String> s1 = Optional.of(s);
        boolean present = s1.isPresent();
        String s2 = s1.get();
        System.out.println(present + "/" + s2);
    }
}
