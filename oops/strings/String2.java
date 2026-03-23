package com.java.oops.strings;

public class String2 {
    public static void main(String[] args) {
        String Str="Hello World";
        System.out.println(Str.substring(2,6));
        System.out.println(Str);
        String Str2=Str.concat(" from concat method");
        System.out.println("Str remains unchanged even after concat with Str2 : "+Str+" Str2= "+Str2);

    }
}
