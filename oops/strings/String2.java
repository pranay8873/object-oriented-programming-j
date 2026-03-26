package com.java.oops.strings;

public class String2 {
    public static void main(String[] args) {
        String Str="Hello World";
        System.out.println(Str.substring(2,6));
        System.out.println(Str);
        String Str2=Str.replace("H","p");
        System.out.println(Str2);
        String[] Parts=Str.split(" ");
        System.out.println(Parts[1]);
    }
}
