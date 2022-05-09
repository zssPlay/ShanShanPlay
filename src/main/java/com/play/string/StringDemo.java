package com.play.string;


public class StringDemo {

    public static void main(String[] args) {
        //StringBuffer线程安全,效率低,StringBuilder线程不安全,那么就效率高
        String s = new String("zhaoz");
        String s1 = "zo";
        System.out.println(s.length());
        System.out.println(s.charAt(1));//返回指定索引处的字符
        System.out.println(s.toCharArray());//转换为字符数组
        System.out.println(s.indexOf("zw",4));//从给定的下标索引开始找,找到后返回字符索引
        System.out.println(s.lastIndexOf("z"));//顺着找找到最后出现的位置
        System.out.println(s.toUpperCase());//转大写
        System.out.println(s.toLowerCase());//转小写
        System.out.println(s.split("@")[0]);//分割,支持正则
        System.out.println(s == s1);
        System.out.println(s.equals(s1));//字符串比较使用equals
        System.out.println(s.equalsIgnoreCase(s1));//忽略大小写比较
        System.out.println(s.substring(1,3));//截取字符串,以1开始,到3为止,不包含3
        System.out.println(s.contains("z"));//包含
        System.out.println(s.replace("z","y"));
        System.out.println("\\");//replace 不支持正则,replaceAll支持,\为转义字符
    }
}
