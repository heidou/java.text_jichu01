package arrayList_01;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class ArrayList_02 {
    public static void main(String[] args){
        ArrayList aaList = new ArrayList();
        aaList.add("aaa");
        aaList.add("bb");
        aaList.add("cc");
        System.out.println(aaList);

        aaList.remove(0);
        aaList.add("ddd");
        System.out.println(aaList);

        aaList.remove(0);
        aaList.add("www");
        System.out.println(aaList);

        if(aaList.contains("aaa")){
            System.out.println("AAAAAA");
        }
        System.out.println(aaList.indexOf("aaa"));
    }
}
