package ru.IShorin.JavaPractice.laba23;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class main {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","d");
        map.put("b","d");
        map.put("c","d");
        map.put("d","d");
        map.put("i","i");
        map.put("z","i");
        map.put("f","o");
        map.put("g","o");
        map.put("h","o");
        map.put("j","p");
        map.put("aa","kj");
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
    public static <K, V> void removeTheFirstNameDuplicates(Map<K, V> map) throws Exception {
        Map<K, V> tmp = new HashMap<K, V>();
        for (Iterator<K> it = map.keySet().iterator(); it.hasNext();) {
            K key = it.next();
            V val = map.get(key);
            if (!tmp.containsValue(val)) {
                tmp.put(key, val);
            }
        }
        map.clear();
        for (Iterator<K> it = tmp.keySet().iterator(); it.hasNext();) {
            K key = it.next();
            map.put((K) tmp.get(key), (V) key);
        }
    }
}
