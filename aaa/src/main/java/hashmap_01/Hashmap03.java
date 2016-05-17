package hashmap_01;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap03 {
    public static void main(String[] args){
        Map<String,String>map = new LinkedHashMap<String, String>();
        map.put("id","1212");
        map.put("skt","faker");
        map.put("lgd","imp");

        for (String values : map.values()){
            System.out.println(values);
        }
    }
}
