package cn.test.compare;

import java.util.Comparator;

/**
 * @ClassName: CompareTest
 * @Author: xiaochen
 * @date: 2021/12/28 19:05
 * @Version: V 1.0
 */

public class CompareTest {

    public static void main(String[] args) {
        //比较两个学生：
        Student s1 = new Student(14,160.5,"alili");
        Student s2 = new Student(14,170.5,"bnana");
        //内部比较器
        System.out.println(s1.compareTo(s2));
        //外部比较器
        Comparator compareAge = new CompareAge();
        Comparator compareName = new CompareName();
        System.out.println(compareAge.compare(s1, s2));
        System.out.println(compareName.compare(s1, s2));
        /*总结：外部比较器，多态，扩展性好。内部比较器，实体类实现比较接口，方便*/

    }

}
