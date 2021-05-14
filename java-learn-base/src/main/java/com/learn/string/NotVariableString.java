package com.learn.string;

/**
 * 不可变特性
 *
 * @author jinglv
 * @date 2021/5/14 10:56 上午
 */
public class NotVariableString {
    public static void main(String[] args) {
        String s = "hello";
        // 显示 hello
        System.out.println(s);
        s = "world";
        // 显示 world
        System.out.println(s);
    }
}
