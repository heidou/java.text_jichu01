package hashmap_01;

import java.util.*;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap01 {
    public static void main(String[] agrs) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "1111111");
        map.put("momor", "momor的信息");
        map.put("caterpillar", "caterpillar的讯息");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }/**输出map的key and value**/

        Collection collection = map.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}