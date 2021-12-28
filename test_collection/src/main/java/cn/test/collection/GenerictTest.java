package cn.test.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: GenerictTest
 * @Author: xiaochen
 * @date: 2021/12/28 18:32
 * @Version: V 1.0
 */

public class GenerictTest {

    public static void main(String[] args) {
        //a,b,c三个集合是并列的关系：
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();
        /*开始使用泛型受限：泛型的上限
        List<? extends Person>:
        就相当于：
        List<? extends Person>是List<Person>的父类，是List<Person的子类>的父类
         */
        List<? extends Person> list1 = null;
        /*list1 = a;
        list1 = b;
        list1 = c;*/
        /*开始使用泛型受限：泛型的下限
        List<? super Person>
        就相当于：
        List<? super Person>是List<Person>的父类，是List<Person的父类>的父类
         */
        List<? super Person> list2 = null;
        list2 = a;
        list2 = b;
        list1 = c;
    }

}

class Person {

}

class Student extends Person {

}
