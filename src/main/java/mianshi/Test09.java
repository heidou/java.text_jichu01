package mianshi;

import javax.print.attribute.standard.MediaSize;

/**
 * @author heidou.f
 *         2016/6/25.
 */
public class Test09 {
    public static void main(String[] args){
        Other o=new Other();
        new Test09().addOne(o);
    }
    public void addOne(final Other o){
        o.i++;
    }
}
class Other{
    public int i;
}
