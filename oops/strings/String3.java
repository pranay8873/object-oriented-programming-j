package com.java.oops.strings;

public class String3 {
    public static void main(String[] args) {
        String Str="Hello World";
        String[] Parts=Str.split(" ");
        System.out.println(Parts[0]);
        String Str2=new String("Hello World");
        System.out.println(Str == Str2);
        System.out.println(Str.equals(Str2));
    }
}
