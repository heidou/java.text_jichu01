package Thread_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @author heidou.f
 *         2016/5/22.
 */
public class DelTask implements Runnable {
    private static final Log log = LogFactory.getLog(DelTask.class);
    private CountDownLatch latch;
    public DelTask(CountDownLatch latch){
        this.latch = latch;
    }
    @Override
     public void run(){
         try {
             Thread.sleep(2000);
             latch.countDown();
             Integer value = Boot.del();
             System.out.println("DelTask= "+value);
         }catch (Exception e){
             log.error("DelTask!",e);
         }
     }
}
