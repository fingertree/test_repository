package cn.test.collection;

/**
 * @ClassName: MyLinkedListTestTest
 * @Author: xiaochen
 * @date: 2021/12/28 18:39
 * @Version: V 1.0
 */

public class MyLinkedListTest {
    //链中一定有一个首节点：
    Node first;
    //链中一定有一个尾节点：
    Node last;
    //计数器：
    int count = 0;
    //提供一个构造器：
    public MyLinkedListTest(){
    }
    //添加元素方法：
    public void add(Object o){
        if(first == null){//证明你添加的元素是第一个节点：
            //将添加的元素封装为一个Node对象：
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            //当前链中第一个节点变为n
            first = n;
            //当前链中最后一个节点变为n
            last = n;
        }else{//证明已经不是链中第一个节点了
            //将添加的元素封装为一个Node对象：
            Node n = new Node();
            n.setPre(last);//n的上一个节点一定是当前链中的最后一个节点last
            n.setObj(o);
            n.setNext(null);
            //当前链中的最后一个节点的下一个元素 要指向n
            last.setNext(n);
            //将最后一个节点变为n
            last = n;
        }
        //链中元素数量加1
        count++;
    }
    //得到集合中元素的数量：
    public int getSize(){
        return count;
    }
    //通过下标得到元素：
    public Object get(int index){
        //获取链表的头元素：
        Node n = first;
        //一路next得到想要的元素
        for(int i=0;i<index;i++){
            n = n.getNext();
        }
        return n.getObj();
    }
}


class Node {//节点类
    //三个属性
    //上一个元素的地址
    private Node pre;
    //当前存入的元素
    private Object obj;
    //下一个元素地址
    private Node next;

    Node() {
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}