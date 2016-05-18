package listList_01;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by heidou
 * 2016/5/8.
 *后进先出，利用linkList实现的栈
 * linkList向list中插入和删除开销不大，但随机访问则较慢
 * linklist可以当作队列、堆栈、双向链表使用
 */
public class LinkedList_stack_01 {
      public static void main(String[] args){
          LinkedList<Integer>linkedList = new LinkedList<Integer>();
          for (int i = 0; i< 5; i++){
              linkedList.push(i);
          }
    //     System.out.println(linkedList);

          try {
              Integer tmInteger = null;
              while ((tmInteger=linkedList.pop()) !=null){
                  System.out.println(linkedList);
              }
          }catch (Exception e){
              if (e instanceof NoSuchElementException){
                  System.out.println("后进先出，利用linkList实现的栈");
              }
          }
      }
}
