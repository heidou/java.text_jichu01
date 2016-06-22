package mianshi;

/**
 * @author heidou.f
 *         2016/5/28.
 *         finally中代码比return和break语句后执行
 *         try中的return语句调用的函数先于finally中调用函数执行
 */
public class Test05 {
    public static void main(String[] args){
        System.out.println(new Test05().test());
    }
    int test(){
        try {
            return func1();
        }finally {
            return func2();
        }
    }
    int func1(){System.out.println("oioi");return 7; }
    int func2(){System.out.println("func2");return 3;}
}
