package com.learn.operation;

/**
 * 类型自动提升与强制转型
 *
 * @author jinglv
 * @date 2021/5/13 5:17 下午
 */
public class TransitionOperation {
    public static void main(String[] args) {
        short s = 1234;
        int i = 123456;
        // s自动转型为int
        int x = s + i;
        // 编译错误
        // short y = s + i;
    }
}
