package mianshi;

import java.util.Date;

/**
 * @author heidou.f
 *         2016/5/13.
 */
public class Text04 extends Date {
    public static void main(String[] args) {
        new Text04().test();
    }

    public void test(){
   //     System.out.println(super.getClass().getName());
        System.out.println(getClass().getSuperclass().getName());
    }
//在test方法中，直接调用getClass().getName()方法，返回的是Test类名
//由于getClass()在Object类中定义成了final，子类不能覆盖该方法，所以，在
 //test方法中调用getClass().getName()方法，其实就是在调用从父类继承的getClass()方法，等效于调用super.getClass().getName()方法，所以，super.getClass().getName()方法返回的也应该是Test。


}
