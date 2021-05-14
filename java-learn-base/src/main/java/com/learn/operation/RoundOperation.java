package com.learn.operation;

/**
 * 四舍五入
 * 对浮点数加上0.5再强制转型
 *
 * @author jinglv
 * @date 2021/5/13 6:13 下午
 */
public class RoundOperation {
    public static void main(String[] args) {
        double d = 2.6;
        int n = (int) (d + 0.5);
        // 结果：3
        System.out.println(n);
    }
}
