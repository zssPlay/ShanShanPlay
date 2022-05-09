package com.play.container;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Random;


public class MapDome {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<Integer,Integer>();
        for (int i = 0; i < 100; i++) {
            int r = rand.nextInt(10);
            Integer freq = m.get(r);//自动拆装箱
            m.put(r,freq == null ? 1 : freq + 1);//根据键改变相应的值
        }
        System.out.println(m);
        System.out.println(m.containsKey(1));//是否包含键
        System.out.println(m.containsValue(3));//是否包含值
    }
}

