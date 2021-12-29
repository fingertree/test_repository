package cn.test.entity;

/**
 * @ClassName: Apple
 * @Author: xiaochen
 * @date: 2021/12/29 20:46
 * @Version: V 1.0
 */

public class Apple implements Comparable<Apple> {

    private int weight;
    private String color;

    public Apple() {
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Apple o) {
        return this.getWeight() - o.getWeight();
    }
}
