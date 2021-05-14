# 输入和输出

## 输出

在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。

println是print line的缩写，表示输出并换行。因此，如果输出后不想换行，可以用print()：

## 格式化输出

Java还提供了格式化输出的功能。为什么要格式化输出？因为计算机表示的数据不一定适合人来阅读：

如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式：

```
double d = 3.1415926;
// 显示两位小数3.14
System.out.printf("%.2f\n", d);
// 显示两位小数3.1416
System.out.printf("%.4f\n", d);
```

Java的格式化功能提供了多种占位符，可以把各种数据类型“格式化”成指定的字符串：

| 占位符 | 说明 |
| ---|---|
| %d | 格式化输出整数 |
| %x | 格式化输出十六进制整数 |
| %f | 格式化输出浮点数 |
| %e | 格式化输出科学计数法表示的浮点数 |
| %s | 格式化字符串 |

注意，由于%表示占位符，因此，连续两个%%表示一个%字符本身。

占位符本身还可以有更详细的格式化参数。下面的例子把一个整数格式化成十六进制，并用0补足8位：

```
int n = 123450000;
// 注意，两个%占位符必须传入两个数
System.out.println("n=%d, hex=%80x", n, n);
```

## 输入

控制台读取一个字符串和一个整数的例子：

```java
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
```

首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头，后面我们在Java的package中会详细讲解如何使用import。

然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。

有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。Scanner会自动转换数据类型，因此不必手动转换。

## 总结

Java提供的输出包括：System.out.println() / print() / printf()，其中printf()可以格式化输出；

Java提供Scanner对象来方便输入，读取对应的类型可以使用：scanner.nextLine() / nextInt() / nextDouble() / ...