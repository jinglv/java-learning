package com.learn.switchs;

/**
 * switch新写法
 *
 * @author jinglv
 * @date 2021/5/17 6:38 下午
 */
public class NewSwitchCondition {
    public static void main(String[] args) {
        String fruit = "apple";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt=" + opt);
    }
}
