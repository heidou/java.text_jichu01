package Thread_01;

import java.util.concurrent.CountDownLatch;

/**
 * @author heidou.f
 *         2016/5/22.
 */
public class AddTask implements Runnable {
    private CountDownLatch latch;

    public AddTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        latch.countDown();
        Integer value = Boot.add();
        System.out.println("AddTask =" + value);
    }
}
