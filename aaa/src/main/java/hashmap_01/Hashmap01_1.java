package hashmap_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap01_1 {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private  static final Log log = LogFactory.getLog(Hashmap01_1.class);
    public static void main(String[] args) {
        HashMap aaMap = new HashMap();
        aaMap.put("aa", "[大白菜]");
        aaMap.put("bb", "[青菜]");

        Iterator aaiterator=aaMap.entrySet().iterator();
        while(aaiterator.hasNext()){
            Map.Entry entry=(Map.Entry)aaiterator.next();
//            aaMap.put(entry.getKey(), entry.getValue().toString().substring(1, entry.getValue().toString().length()-1));
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }

        Iterator bbiterator=aaMap.entrySet().iterator();
        while(bbiterator.hasNext()){
            Map.Entry entry=(Map.Entry)bbiterator.next();
            aaMap.put(entry.getKey(), entry.getValue().toString().substring(1, entry.getValue().toString().length()-1));
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }

        System.out.println(aaMap.size());
    }

}

