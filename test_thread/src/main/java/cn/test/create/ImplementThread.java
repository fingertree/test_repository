package cn.test.create;

/**
 * @ClassName: ImplementThread
 * @Author: xiaochen
 * @date: 2021/12/30 11:19
 * @Version: V 1.0
 */

public class ImplementThread implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":实现创建线程执行！");
    }
}
