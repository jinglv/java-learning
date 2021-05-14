package com.learn.variable;

/**
 * 变量之间的赋值
 *
 * @author jinglv
 * @date 2021/5/12 5:31 下午
 */
public class VariableAssignment {
    public static void main(String[] args) {
        // 定义变量n，同时赋值为100
        int n = 100;
        // 打印n的值
        System.out.println("n=" + n);
        // 变量n赋值为200
        n = 200;
        // 打印n的值
        System.out.println("n=" + n);
        // 变量x赋值为n(n的值为200，因此赋值后x的值也是200)
        int x = n;
        // 打印x的值
        System.out.println("x=" + x);
        // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        x = x + 100;
        // 打印x的值，300
        System.out.println("x=" + x);
        // 再次打印n的值，n应该是200还是300？是200
        System.out.println("n=" + n);
    }
}
