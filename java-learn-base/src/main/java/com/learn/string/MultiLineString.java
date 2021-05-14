package com.learn.string;

/**
 * 多行字符串
 *
 * @author jinglv
 * @date 2021/5/14 10:48 上午
 */
public class MultiLineString {
    public static void main(String[] args) {
        String s = """
                SELECT * FROM
                users
                WHERE id > 100
                ORDER BY name DESC;
                """;
        System.out.println(s);
    }
}
