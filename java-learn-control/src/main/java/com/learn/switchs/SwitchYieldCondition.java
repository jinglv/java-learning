package com.learn.switchs;

/**
 * yield使用
 *
 * @author jinglv
 * @date 2021/5/17 6:41 下午
 */
public class SwitchYieldCondition {
    public static void main(String[] args) {
        String fruit = "orange";
        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                // switch语句返回值
                yield code;
            }
        };
        System.out.println("opt=" + opt);
    }
}
