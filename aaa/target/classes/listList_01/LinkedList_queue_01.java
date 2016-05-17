package listList_01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by heidou
 * 2016/5/8.
 * LinkedList实现，先进先出队列--列表
 */
public class LinkedList_queue_01 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Hello");
        queue.offer("World");
        queue.offer("你好！");
        System.out.println("size = " + queue.size());

        String as;
        while ((as = queue.poll()) != null) {
//          poll取出            
            System.out.println(as);
        }
        System.out.println("-----------");
        System.out.println(queue.size());
    }
}