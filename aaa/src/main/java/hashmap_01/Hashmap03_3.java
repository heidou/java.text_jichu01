package hashmap_01;

import java.util.*;

/**
 * Created by heidou
 * 2016/5/8.
 */
public class Hashmap03_3 {
    /**
     * @param args
     */
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("d", 2);
        map.put("c", 1);
        map.put("b", 1);
        map.put("a", 3);

        List<Map.Entry<String, Integer>> infoIds =
                new ArrayList<Map.Entry<String, Integer>>(map.entrySet());


        //排序
        Collections.sort(infoIds, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue()); //从大到小排列
	//	        return (o1.getKey()).toString().compareTo(o2.getKey());
            }
        });


        Iterator aaiterator=infoIds.iterator();
        while(aaiterator.hasNext()){
            Map.Entry entry=(Map.Entry)aaiterator.next();
            System.out.println(entry.getKey()+" , "+entry.getValue());
        }


        //排序后
        for (int i = 0; i < infoIds.size(); i++) {
            String id = infoIds.get(i).toString();
            System.out.println(id);
        }
    }
}
