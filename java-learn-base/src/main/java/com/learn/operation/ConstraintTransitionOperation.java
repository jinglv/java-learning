package com.learn.operation;

/**
 * 强制转型
 *
 * @author jinglv
 * @date 2021/5/13 5:21 下午
 */
public class ConstraintTransitionOperation {
    public static void main(String[] args) {
        int i1 = 1234567;
        short s1 = (short) i1;
        // 结果：-10617
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short) i2;
        // 结果：24910
        System.out.println(s2);
    }
}
