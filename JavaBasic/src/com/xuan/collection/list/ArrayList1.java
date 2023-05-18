package com.xuan.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("hello", "world"));
        System.out.println(Arrays.toString(new ArrayList[]{list}));
    }
}
