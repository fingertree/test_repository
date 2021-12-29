package stream;

import cn.test.entity.Apple;
import cn.test.entity.GroupBrandCateBO;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName: StreamTest
 * @Author: xiaochen
 * @date: 2021/12/29 20:44
 * @Version: V 1.0
 */

public class StreamTest {

    @Test
    public void testLambdaCompare(){

        List<Apple> inventory = Lists.newArrayList(
                new Apple(10, "red"),
                new Apple(5, "red"),
                new Apple(1, "green"),
                new Apple(15, "green"),
                new Apple(2, "red"),
                new Apple(2, "red"));

//        inventory.sort(new AppleComparator());
//        inventory.sort((Apple::compareTo));

//        inventory.sort(Comparator.comparingInt(Apple::getWeight));
        inventory.sort(Comparator.comparing(Apple::getColor));
        //inventory = inventory.stream().distinct().collect(Collectors.toList());

        //inventory.sort((a, b) -> a.getWeight() - b.getWeight()< 0 ? -1 : 1);

//        Comparator<Apple> comparing = comparing((Apple a) -> a.getWeight());
//        inventory.sort(comparing(Apple::getWeight));

//        inventory.sort(comparing(Apple::getWeight).reversed());
//        Predicate<Apple> filter1 = p -> p.getWeight()>=10;

//        inventory = inventory.stream().filter(filter1).sorted((a, b) -> a.getWeight() - b.getWeight()).collect(Collectors.toList());
        inventory.forEach(d -> System.out.print(d.getWeight()+","));
        //inventory.forEach(System.out::print);

//        int totalSalary = inventory
//                .parallelStream()
//                .mapToInt(p -> p.getWeight())
//                .sum();
//        System.out.println(totalSalary);
    }

    @Test
    public void testStreamSummaryStatistics(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt(x -> x)
                .summaryStatistics();
//        stats.combine(stats);
//        System.out.print(stats.getAverage()+","+stats.getCount()+","+stats.getMax()+","+stats.getMin()+","+stats.getSum());
        stats.accept(11);
        System.out.println(stats.toString());

    }

    @Test
    public void testOptional(){
        String a = "a";
        String b = null;
        String c = "c";
        String d = Optional.ofNullable(a).orElse(c);
        String e = Optional.ofNullable(b).orElse(c);
        final String[] f = {""};
        Optional.ofNullable(a).ifPresent(o -> {
            f[0] = o;
        });
        System.out.print(d + " , " + e + " , " + f[0]);
    }

    @Test
    public void testCollectorsToMap(){
        List<GroupBrandCateBO> list = new ArrayList<>(
                Arrays.asList(
                        new GroupBrandCateBO("v1", "g1", "b1"),
                        new GroupBrandCateBO("v1", "g1", "b1"),
                        new GroupBrandCateBO("v3", "g3", "b3")
                )
        );
        Map<String, String> map = list.stream().collect(Collectors.toMap(item -> item.getVersion(), item -> item.getGroupCode(), (oldVal, currVal) -> oldVal, LinkedHashMap::new));
        System.out.println(map.toString());
        Map<String, String> map0 = list.stream().collect(Collectors.toMap(item -> item.getVersion(), item -> item.getGroupCode(), (oldVal, currVal) -> oldVal));
        System.out.println(map0.getClass());
        System.out.println(map0.toString());
        Map<String,String> map1 = new HashMap<>();
        map1.put("a","b");
        System.out.println(map1.toString());
        //Map<String, String> map1 = list.stream().collect(Collectors.toMap(GroupBrandCateBO::getVersion, GroupBrandCateBO::getGroupCode));
        //System.out.println(map1.toString());
        //(oldVal, currVal) -> currVal) // key相同时当前值替换原始值
        //(oldVal, currVal) -> oldVal + currVal //key相同时保留原始值和当前值
        for (Map.Entry<String,String> m : map.entrySet()) {
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }

    @Test
    public void testStreamGroup(){
        List<Integer> list = new ArrayList() {
            {
                add(12);
                add(20);
                add(12);
                add(22);
                add(22);
                add(23);
                add(159);
                add(12);
            }
        };

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(p -> p,Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
