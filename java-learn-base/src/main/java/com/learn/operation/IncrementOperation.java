package com.learn.operation;

/**
 * 自增/自减运算
 *
 * @author jinglv
 * @date 2021/5/12 6:39 下午
 */
public class IncrementOperation {
    public static void main(String[] args) {
        int n = 3300;
        // 自增，3301，相当于n = n + 1;
        n++;
        // 自减，3300，相当于n = n - 1;
        n--;
        // ++n，先加1在运算，注意：不要这么写
        int y = 100 + (++n);
        System.out.println(y);
    }
}
