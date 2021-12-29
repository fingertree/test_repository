package stream;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ListTest
 * @Author: xiaochen
 * @date: 2021/12/29 21:33
 * @Version: V 1.0
 */

public class ListTest {

    @Test
    public void testListSimple(){
         /*
        List接口中常用方法：
        增加：add(int index, E element)
        删除：remove(int index)  remove(Object o)
        修改：set(int index, E element)
        查看：get(int index)
        判断：
         */
        List list = new ArrayList();
        list.add(13);
        list.add(17);
        list.add(6);
        list.add(-1);
        list.add(2);
        list.add("abc");
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);
        list.set(3,77);
        System.out.println(list);
        list.remove(2);//在集合中存入的是Integer类型数据的时候，调用remove方法调用的是：remove(int index)
        System.out.println(list);
        list.remove("abc");
        System.out.println(list);
        Object o = list.get(0);
        System.out.println(o);
        //List集合 遍历：
        //方式1：普通for循环：
        System.out.println("---------------------");
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //方式2：增强for循环：
        System.out.println("---------------------");
        for(Object obj:list){
            System.out.println(obj);
        }
        //方式3：迭代器：
        System.out.println("---------------------");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Test
    public void testSubList() {
        List<String> list_01 =  new ArrayList<>();
        list_01.add("apple");
        list_01.add("banana");
        list_01.add("orange");
        list_01.remove("strawberry");
        list_01 = list_01.subList(2,list_01.size());
        System.out.println(list_01);
    }

    @Test
    public void testPatition(){
        List<String> list_02 = new ArrayList<String>(){{add("a");add("b");add("c");add("d");add("e");add("f");add("g");}};
        List<List<String>> partLists = Lists.partition(list_02,2);
        System.out.println(partLists.toString());
        System.out.println(partLists.size());
    }
}
