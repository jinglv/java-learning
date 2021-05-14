package com.learn.arrays;

/**
 * 数组越界，抛出异常
 *
 * @author jinglv
 * @date 2021/5/14 11:17 上午
 */
public class ArrayBound {
    public static void main(String[] args) {
        // 5位同学的成绩
        int[] ns = new int[5];
        int n = 5;
        /*
         输出结果：
         Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	            at com.learn.arrays.ArrayBound.main(ArrayBound.java:14)
         */
        System.out.println(ns[5]);
    }
}
