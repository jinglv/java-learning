package com.learn.operation;

/**
 * 位运算
 *
 * @author jinglv
 * @date 2021/5/13 4:16 下午
 */
public class BitOperation {
    public static void main(String[] args) {
        // 转换为二进制：00001010 00000000 00010001 01001101
        int i = 167776589;
        // 转换为二进制：00001010 00000000 00010001 00000000
        int n = 167776512;
        // 结果：167776512
        System.out.println(i & n);
    }
}
