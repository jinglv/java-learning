package com.learn.operation;

/**
 * 整数运算溢出
 *
 * @author jinglv
 * @date 2021/5/12 6:24 下午
 */
public class OverflowOperation {
    public static void main(String[] args) {
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        // 输出结果：-2147483641
        System.out.println(sum);
    }
}
