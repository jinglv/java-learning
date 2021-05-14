package com.learn.variable;

/**
 * 定义整型
 *
 * @author jinglv
 * @date 2021/5/12 6:02 下午
 */
public class IntegerVariable {
    public static void main(String[] args) {
        int i = 2147483647;
        int i2 = -2147483647;
        // 加下划线更容易识别
        int i3 = 2_000_000_000;
        // 十六进制表示的16711680
        int i4 = 0xff0000;
        // 二进制表示的512
        int i5 = 0b1000000000;
        // long型的结尾需要加L
        long l = 9000000000000000000L;
    }
}
