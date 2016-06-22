package ThreadTest;

/**
 * @author heidou.f
 *         2016/6/19.
 *         sleep()与wait()区别
 */
public class MultiThread {
    public static void main(String[] args){
        new Thread(new Thread1()).start();
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Thread(new Thread2()).start();
    }
    private static class Thread1 implements Runnable{

        @Override
        public void run() {
            synchronized (MultiThread.class){
                System.out.println("enter thread1....");
                System.out.println("thread1 is waiting");
                try{
          //释放锁，第一种程序自然离开监视器的范围，离开synchronized关键字管辖范围；第二种在synchronized管辖区内调用监视器对象的wait方法
                    MultiThread.class.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("thread1 is going on...");
                System.out.println("thread1 is being over!");
            }
        }
    }
    private static class Thread2 implements Runnable{

        @Override
        public void run() {
            synchronized (MultiThread.class){
                System.out.println("enter thread2....");
                System.out.println("thread2 notify other thread can release wait status...");
      //notify方法并不释放锁，即使thread2调用下面sleep方法休息10秒，但thread1仍然不会执行，因为thread2没有释放锁，所以thread1无法得到锁
                MultiThread.class.notify();
                System.out.println("thread2 is sleeping tenmilli second...");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("thread2 is going on...");
                System.out.println("thread2 is being over!");
            }
        }
    }
}
