package cn.test.create;

/**
 * @ClassName: ExtendThread
 * @Author: xiaochen
 * @date: 2021/12/30 10:56
 * @Version: V 1.0
 */

public class ExtendThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":继承创建线程执行！");
    }

}
