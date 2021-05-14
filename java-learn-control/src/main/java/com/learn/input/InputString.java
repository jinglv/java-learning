package com.learn.input;

import java.util.Scanner;

/**
 * 控制台输入
 *
 * @author jinglv
 * @date 2021/5/14 5:21 下午
 */
public class InputString {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 打印提示
        System.out.print("Input your name:");
        // 读取一行输入并获取字符串
        String name = scanner.nextLine();
        // 打印提示
        System.out.print("Input your age:");
        // 读取一行输入并获取整数
        int age = scanner.nextInt();
        // 格式化输出
        System.out.printf("Hi, %s, you are %d\n", name, age);
    }
}
