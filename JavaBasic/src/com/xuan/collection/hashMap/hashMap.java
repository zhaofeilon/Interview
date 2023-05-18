package com.xuan.collection.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("xiaohong", "hello");
        hashMap.put("xiaolan", "world");
        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.println(value);
        }
        Set<String> keySet = hashMap.keySet();
        for (String key: keySet
             ) {
            System.out.println(key);

        }
    }
}
