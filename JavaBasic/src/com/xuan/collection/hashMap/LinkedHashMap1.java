package com.xuan.collection.hashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("xiaolv", "hello ");
        linkedHashMap.putIfAbsent("xiaohong", "world");
        System.out.println(linkedHashMap.get("xiaolv"));
    }
}
