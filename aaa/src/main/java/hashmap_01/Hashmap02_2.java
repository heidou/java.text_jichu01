package hashmap_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap02_2 {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {


        HashMap aaMap =new HashMap();
        aaMap.put("aa", "白菜");
        aaMap.put("bb", "青菜");

        HashMap bbMap = new HashMap();
        bbMap.put("aa", "西瓜");

 //        bbMap.putAll(aaMap);


        Iterator aaiterator=bbMap.entrySet().iterator();
        while(aaiterator.hasNext()){
            Map.Entry entry=(Map.Entry)aaiterator.next();
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }

    }
}

