package cn.test.create;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @ClassName: CallableThread
 * @Author: xiaochen
 * @date: 2021/12/30 11:29
 * @Version: V 1.0
 */

public class CallableThread implements Callable<Integer> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ":callable创建线程执行！");
        return new Random().nextInt(100);
    }
}
