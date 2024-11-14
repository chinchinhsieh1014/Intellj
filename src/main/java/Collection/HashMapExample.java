package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // <key, value>
        HashMap<String, Integer> map = new HashMap<>();

        // put
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // get
        int index_a = map.get("a");
        System.out.println(index_a);

        // containsKey
        boolean has_d = map.containsKey("d");
        System.out.println(has_d);

        // remove key
        map.remove("a");

        // for
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+": "+value);
        }

        // iterate over keys
        for (String key: map.keySet()) {
            System.out.println(key);
        }
        // iterate over values
        for (int value: map.values()) {
            System.out.println(value);
        }
        // get a list of values
        List<Integer> values = new ArrayList<>(map.values());

        // size
        int size = map.size();
        System.out.println(size);

        // clear
        map.clear();


    }
}

