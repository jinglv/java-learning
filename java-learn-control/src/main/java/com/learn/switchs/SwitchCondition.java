package com.learn.switchs;

/**
 * switch表达式
 *
 * @author jinglv
 * @date 2021/5/17 5:11 下午
 */
public class SwitchCondition {
    public static void main(String[] args) {
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }
    }
}
