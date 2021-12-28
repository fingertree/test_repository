package cn.test.collection;

import java.util.Stack;

/**
 * @ClassName: StackTest
 * @Author: xiaochen
 * @date: 2021/12/28 18:19
 * @Version: V 1.0
 */

public class StackTest {

    public static void main(String[] args) {
                /*
        Stack是Vector的子类，Vector里面两个重要的属性：
        Object[] elementData;底层依然是一个数组
        int elementCount;数组中的容量
         */
        Stack s = new Stack();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        System.out.println(s);//[A, B, C, D]
        System.out.println("栈是否为空：" + s.empty());
        System.out.println("查看栈顶的数据，但是不移除：" + s.peek());
        System.out.println(s);
        System.out.println("查看栈顶的数据，并且移除：" + s.pop());
        System.out.println(s);
        s.push("D");//和add方法执行的功能一样，就是返回值不同
        System.out.println(s);

    }

}
