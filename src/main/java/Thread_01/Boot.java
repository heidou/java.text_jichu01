package Thread_01;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author heidou.f
 *         2016/5/22.
 */
public class Boot {
    private static AtomicInteger value = new AtomicInteger(10);

    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0; i < 3; i++) {
            new Thread(new AddTask(latch)).start();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(new DelTask(latch)).start();
        }
        latch.await();
        System.out.println("value= " + value.get());
    }

    public static synchronized Integer add() {
        return value.incrementAndGet();
    }

    public static synchronized Integer del() {
        return value.decrementAndGet();
    }
}
