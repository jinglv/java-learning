package com.learn.condition;

/**
 * 条件判断-判断引用类型相当
 *
 * @author jinglv
 * @date 2021/5/17 4:45 下午
 */
public class IfElseStringCondition {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        // 结果：s1==s2
        if (s1.equals(s2)) {
            System.out.println("s1==s2");
        } else {
            System.out.println("s1!=s2");
        }
    }
}
