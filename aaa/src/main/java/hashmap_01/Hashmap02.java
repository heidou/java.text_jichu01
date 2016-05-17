package hashmap_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap02 {
    private  static final Log log = LogFactory.getLog(Hashmap02.class);
    public static void main(String[] args){
        Map<String,String>map = new HashMap<String, String>();
        String key1 = "caterpillar";
        String key2 = "justin";
        map.put(key1,"caterpillar的讯息");
        map.put(key2,"justin的信息");

        log.info("------"+ map.get(key1));
        System.out.println(map.get(key2));
    }
}
