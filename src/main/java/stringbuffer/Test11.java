package stringbuffer;

/**
 * @author heidou.f
 *         2016/6/26.
 */
public class Test11 {
    public static void main(String[] args){
        SuperClass a=new SubClass();
        System.out.println(a.i);
    }
    }
class SuperClass{
    int i=8;
    SuperClass(){
        add(1);
    }
    void add(int j){
        i=i+j;
    }
}
class SubClass extends SuperClass{
    int i=8;
    void add(int j){
        i=i+2*j;
    }
}