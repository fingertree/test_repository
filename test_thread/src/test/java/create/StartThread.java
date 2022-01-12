package create;

import cn.test.create.CallableThread;
import cn.test.create.ExtendThread;
import cn.test.create.ImplementThread;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName: create.StartThread
 * @Author: xiaochen
 * @date: 2021/12/30 11:03
 * @Version: V 1.0
 */

public class StartThread {

    @Test
    public void testExtendThread(){
        ExtendThread ext = new ExtendThread();
        ext.setName("extendThread_01");
        ext.start();
    }

    @Test
    public void testImplementThread(){
        ImplementThread it = new ImplementThread();
        Thread thread = new Thread(it, "implementThread_01");
        thread.start();
    }

    @Test
    public void testCallableThread(){
        CallableThread ct = new CallableThread();
        FutureTask ft = new FutureTask(ct);
        Thread t = new Thread(ft, "callableThread_01");
        t.start();
        try {
            Object obj = ft.get();
            System.out.println(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


}
