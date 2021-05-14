package com.learn.arrays;

/**
 * 数组是引用类型，并且数组大小不可变
 *
 * @author jinglv
 * @date 2021/5/14 11:24 上午
 */
public class NotVariableArray {
    public static void main(String[] args) {
        // 5位同学的成绩
        int[] ns;
        ns = new int[]{68, 79, 91, 85, 62};
        // 结果：5
        System.out.println(ns.length);
        ns = new int[]{1, 2, 3};
        // 结果：3
        System.out.println(ns.length);
    }
}
