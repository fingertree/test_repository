package cn.test.collection;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName: CreateList
 * @Author: xiaochen
 * @date: 2021/12/29 21:27
 * @Version: V 1.0
 */

public class CreateList {

    public static void main(String[] args) {
        //数组转list集合
        List l1 = Stream.of("a","b").collect(Collectors.toList());
        List l2 = Lists.newArrayList("a","b","c");
        List l3 = Arrays.asList("a","b","c","d");//定长 add会报错

        String[] array = {"a","b","c"};
        List<String> resultList = new ArrayList<>(Arrays.asList(array));//定长

        List<String> resultList1 = new ArrayList<>(array.length);
        Collections.addAll(resultList1,array);
        //Java9
        //List<String> resultList2 = List.of(array);
        //list转数组
        String[] array2 = resultList1.toArray(new String[resultList1.size()]);
    }

}
