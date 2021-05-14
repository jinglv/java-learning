package com.learn.operation;

/**
 * 浮点数运算误差
 * 观察计算结果是否相等
 *
 * @author jinglv
 * @date 2021/5/13 6:04 下午
 */
public class FloatOperation {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 结果：0.1
        System.out.println(x);
        // 结果：0.09999999999999998
        System.out.println(y);
    }
}
