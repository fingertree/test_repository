package cn.test.entity;

import java.util.Comparator;

/**
 * @ClassName: AppleComparator
 * @Author: xiaochen
 * @date: 2021/12/29 20:50
 * @Version: V 1.0
 */

public class AppleComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
