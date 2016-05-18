package mianshi;

/**
 * @author heidou.f
 *         2016/5/13.
 */
public class TextClone1 implements Cloneable {
    int count;
    TextClone1 next;
     TextClone1(int count) {
        this.count = count;
        if (count > 0)
            next = new  TextClone1(count - 1);
    }
    void add() {
        count++;
        if (next != null)
            next.count++;

    }

    public String toString() {

        String s = String.valueOf(count) + " ";

        if (next != null)

            s += next.toString();

        return s;

    }

    public Object clone() {

        Object o = null;

        try {

            o = super.clone();//如果没有实现cloneable，将会抛出CloneNotSupported异常

        } catch (CloneNotSupportedException e) {

            System.err.println("cannot clone");

        }

        return o;

    }
    public static void main(String[] args){

        TextClone1 t=new  TextClone1(1);

        System.out.println("t="+t);

        TextClone1 t1=( TextClone1)t.clone();
     //   t1.next=(TextClone1)t.next.clone();

        System.out.println("t1="+t1);

        t.add();

        System.out.println("after added\nt t="+t+"\nt1="+t1);

    }

}
