package com.learn.operation;

/**
 * 浮点型类型提升
 *
 * @author jinglv
 * @date 2021/5/13 6:08 下午
 */
public class FloatTransitionOperation {
    public static void main(String[] args) {
        int n = 5;
        double d = 1.2 + 24.0 / n;
        // 结果：6.0
        System.out.println(d);
    }
}
