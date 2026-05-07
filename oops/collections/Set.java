package com.java.oops.collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        set1.add(20);
        set1.add("pranay");
        System.out.println(set1);
        set1.add("samuel");
        System.out.println(set1);
    }
}
