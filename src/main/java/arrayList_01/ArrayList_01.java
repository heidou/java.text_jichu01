package arrayList_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by heidou
 * 2016/5/8.
 * 将string转变成list
 */
public class ArrayList_01 {

    public static void main(String[] args) {
        /**array转list
         * */
        String vgString = "1111,333";
        List<String> ogList = Arrays.asList(vgString.split(","));
        System.out.println("" + ogList);


        for (String igId : ogList) {
            long userId = Long.parseLong(igId);
            System.out.println("userId=" + userId);
        }
        /**list转arry
         *
         */
        List<String> strList = new ArrayList<String>();
        strList.add("sd");
        strList.add("bs");
        String[] strs = (String[]) strList.toArray(new String[strList.size()]);
        System.out.println("Arrays = " + Arrays.asList(strs));
    }
}
