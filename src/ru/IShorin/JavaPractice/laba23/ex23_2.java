package ru.IShorin.JavaPractice.laba23;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class HashMapEx {
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
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
        return map;
    }
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet()) {
            for (Map.Entry<String, String> s2 : copy.entrySet()) {
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey()))
                    removeItemFromMapByValue(map, s.getValue());
            }
        }
    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
class main_1 {
    public static void main(String[] args){
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Moscow");
        tmp.add("Saint-Petersburg");
        ArrayList<String> tmp_1 = new ArrayList<>();
        tmp_1.add("Washington");
        tmp_1.add("New-York");
        map.put("Russia", tmp);
        map.put("USA",tmp_1);
        System.out.println(map.get("Usa"));
    }
}