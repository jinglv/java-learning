package com.learn.string;

/**
 * 字符串连接
 *
 * @author jinglv
 * @date 2021/5/14 10:43 上午
 */
public class StringConnect {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "world";
        String ss = s1 + " " + s2 + "!";
        // 结果：Hello world!
        System.out.println(ss);
        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
        int age = 25;
        String s = "age is " + age;
        // 结果：age is 25
        System.out.println(s);
    }
}
