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

# if判断

在Java程序中，如果要根据条件来决定是否执行某一段代码，就需要if语句。

if语句的基本语法是：

```
if (条件) {
    // 条件满足时执行
}
```

根据if的计算结果（true还是false），JVM决定是否执行if语句块（即花括号{}包含的所有语句）。

当条件n >= 60计算结果为true时，if语句块被执行，将打印"及格了"，否则，if语句块将被跳过。修改n的值可以看到执行效果。

注意到if语句包含的块可以包含多条语句：

```java
package com.learn.condition;

/**
 * @author jinglv
 * @date 2021/5/17 4:27 下午
 */
public class IfCondition {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60) {
            System.out.println("恭喜你");
            System.out.println("及格了");
        }
        System.out.println("END");
    }
}
```

当if语句块只有一行语句时，可以省略花括号{}：

```java
public class IfCondition {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60)
            // 只能只有一条语句
            System.out.println("及格了");
        System.out.println("END");
    }
}
```

但是，省略花括号并不总是一个好主意。假设某个时候，突然想给if语句块增加一条语句时：

```java
public class IfCondition {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60)
            System.out.println("恭喜你");
        // 注意：这条语句就不是if语句块的一部分了
        System.out.println("及格了");
        System.out.println("END");
    }
}
```

由于使用缩进格式，很容易把两行语句都看成if语句的执行块，但实际上只有第一行语句是if的执行块。在使用git这些版本控制系统自动合并时更容易出问题，所以不推荐忽略花括号的写法。

## else

if语句还可以编写一个else { ... }，当条件判断为false时，将执行else的语句块：

```java
package com.learn.condition;

/**
 * 条件判断
 *
 * @author jinglv
 * @date 2021/5/17 4:33 下午
 */
public class IfElseCondition {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }
}
```

修改上述代码n的值，观察if条件为true或false时，程序执行的语句块。

注意，else不是必须的。

还可以用多个if ... else if ...串联

```java
package com.learn.condition;

/**
 * 条件判断
 *
 * @author jinglv
 * @date 2021/5/17 4:33 下午
 */
public class IfElseCondition {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");
    }
}
```

串联的效果其实相当于：

```
if (n >= 90) {
    // n >= 90为true:
    System.out.println("优秀");
} else {
    // n >= 90为false:
    if (n >= 60) {
        // n >= 60为true:
        System.out.println("及格了");
    } else {
        // n >= 60为false:
        System.out.println("挂科了");
    }
}
```

在串联使用多个if时，要特别注意判断顺序。观察下面的代码：

```
int n = 100;
if (n >= 90) {
    // n >= 90为true:
    System.out.println("优秀");
} else {
    // n >= 90为false:
    if (n >= 60) {
        // n >= 60为true:
        System.out.println("及格了");
    } else {
        // n >= 60为false:
        System.out.println("挂科了");
    }
}
```

执行发现，n = 100时，满足条件n >= 90，但输出的不是"优秀"，而是"及格了"，原因是if语句从上到下执行时，先判断n >= 60成功后，后续else不再执行，因此，if (n >= 90)没有机会执行了。

正确的方式是按照判断范围从大到小依次判断：

```
// 从大到小依次判断：
if (n >= 90) {
    // ...
} else if (n >= 60) {
    // ...
} else {
    // ...
}
```

或者改写成从小到大依次判断：

```
// 从小到大依次判断：
if (n < 60) {
    // ...
} else if (n < 90) {
    // ...
} else {
    // ...
}
```

使用if时，还要特别注意边界条件。例如：

```
int n = 90;
if (n > 90) {
    System.out.println("优秀");
} else if (n >= 60) {
    System.out.println("及格了");
} else {
    System.out.println("挂科了");
}
```

假设我们期望90分或更高为“优秀”，上述代码输出的却是“及格”，原因是>和>=效果是不同的。

前面讲过了浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱：

```
double x = 1 - 9.0 / 10;
if (x == 0.1) {
    System.out.println("x is 0.1");
} else {
    System.out.println("x is NOT 0.1");
}
```

正确的方法是利用差值小于某个临界值来判断：

```
double x = 1 - 9.0 / 10;
if (Math.abs(x - 0.1) < 0.00001) {
    System.out.println("x is 0.1");
} else {
    System.out.println("x is NOT 0.1");
}
```

## 判断引用类型相等

在Java中，判断值类型的变量是否相等，可以使用==运算符。但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。例如，下面的两个String类型，它们的内容是相同的，但是，分别指向不同的对象，用==判断，结果为false：

```java
package com.learn.condition;

/**
 * 条件判断-判断引用类型相当
 *
 * @author jinglv
 * @date 2021/5/17 4:45 下午
 */
public class IfElseStringCondition {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        // 结果：s1!=s2
        if (s1 == s2) {
            System.out.println("s1==s2");
        } else {
            System.out.println("s1!=s2");
        }
    }
}
```

要判断引用类型的变量内容是否相等，必须使用`equals()`方法：

```java
package com.learn.condition;

/**
 * 条件判断-判断引用类型相当
 *
 * @author jinglv
 * @date 2021/5/17 4:45 下午
 */
public class IfElseStringCondition {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        // 结果：s1==s2
        if (s1.equals(s2)) {
            System.out.println("s1==s2");
        } else {
            System.out.println("s1!=s2");
        }
    }
}
```

注意：执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException：

```
String s1 = null;
if (s1.equals("hello")) {
    System.out.println("hello");
}
```

要避免NullPointerException错误，可以利用短路运算符&&：

```
String s1 = null;
if (s1 != null && s1.equals("hello")) {
    System.out.println("hello");
}
```

还可以把一定不是null的对象"hello"放到前面：例如：if ("hello".equals(s)) { ... }。

## 总结

if ... else可以做条件判断，else是可选的；

不推荐省略花括号{}；

多个if ... else串联要特别注意判断顺序；

要注意if的边界条件；

要注意浮点数判断相等不能直接用==运算符；

引用类型判断内容相等要使用equals()，注意避免NullPointerException。

# switch多重选择

除了if语句外，还有一种条件判断，是根据某个表达式的结果，分别去执行不同的分支。

switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行。

```
int option = 1;
switch (option) {
case 1:
    System.out.println("Selected 1");
    break;
case 2:
    System.out.println("Selected 2");
    break;
case 3:
    System.out.println("Selected 3");
    break;
}
```

修改option的值分别为1、2、3，观察执行结果。

如果option的值没有匹配到任何case，例如option = 99，那么，switch语句不会执行任何语句。这时，可以给switch语句加一个default，当没有匹配到任何case时，执行default：

如果把switch语句翻译成if语句，那么上述的代码相当于：

```
if (option == 1) {
    System.out.println("Selected 1");
} else if (option == 2) {
    System.out.println("Selected 2");
} else if (option == 3) {
    System.out.println("Selected 3");
} else {
    System.out.println("Not selected");
}
```

对于多个==判断的情况，使用switch结构更加清晰。

同时注意，上述“翻译”只有在switch语句中对每个case正确编写了break语句才能对应得上。

使用switch时，注意case语句并没有花括号{}，而且，case语句具有“穿透性”，漏写break将导致意想不到的结果：

```
int option = 2;
switch (option) {
case 1:
    System.out.println("Selected 1");
case 2:
    System.out.println("Selected 2");
case 3:
    System.out.println("Selected 3");
default:
    System.out.println("Not selected");
}
```

当option = 2时，将依次输出"Selected 2"、"Selected 3"、"Not selected"，原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break。

如果有几个case语句执行的是同一组语句块，可以这么写：

```
int option = 2;
switch (option) {
case 1:
    System.out.println("Selected 1");
    break;
case 2:
case 3:
    System.out.println("Selected 2, 3");
    break;
default:
    System.out.println("Not selected");
    break;
}
```

使用switch语句时，只要保证有break，case的顺序不影响程序逻辑：

```
switch (option) {
case 3:
    ...
    break;
case 2:
    ...
    break;
case 1:
    ...
    break;
}
```

但是仍然建议按照自然顺序排列，便于阅读。

switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”。例如：

```
String fruit = "apple";
switch (fruit) {
case "apple":
    System.out.println("Selected apple");
    break;
case "pear":
    System.out.println("Selected pear");
    break;
case "mango":
    System.out.println("Selected mango");
    break;
default:
    System.out.println("No fruit selected");
    break;
}
```

## switch表达式

使用switch时，如果遗漏了break，就会造成严重的逻辑错误，而且不易在源代码中发现错误。从Java 12开始，switch语句升级为更简洁的表达式语法，使用类似模式匹配（Pattern
Matching）的方法，保证只有一种路径会被执行，并且不需要break语句：

```java
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
```

注意新语法使用`->`，如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应。

我们还可能用switch语句给某个变量赋值。例如：

```
int opt;
switch (fruit) {
case "apple":
    opt = 1;
    break;
case "pear":
case "mango":
    opt = 2;
    break;
default:
    opt = 0;
    break;
}
```

使用新的switch语法，不但不需要break，还可以直接返回值。把上面的代码改写如下：

```
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
```

## yield

大多数时候，在switch表达式内部，我们会返回简单的值。

但是，如果需要复杂的语句，我们也可以写很多语句，放到{...}里，然后，用yield返回一个值作为switch语句的返回值：

```java
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
```

## 总结

switch语句可以做多重选择，然后执行匹配的case语句后续代码；

switch的计算结果必须是整型、字符串或枚举类型；

注意千万不要漏写break，建议打开fall-through警告；

总是写上default，建议打开missing default警告；

从Java 14开始，switch语句正式升级为表达式，不再需要break，并且允许使用yield返回值。
