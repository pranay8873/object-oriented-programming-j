package com.java.oops.strings;

public class Strings {
    public static void main(String[] args) {
        String name=new String("pranay" );
        String name2="pranay";
        String name3="pranay";
        System.out.println(name==name2);
        System.out.println(name2==name3);
        String name4;
        name4=name2+name3;
        System.out.println(name4);
        System.out.println(name4.length());
    }
}
