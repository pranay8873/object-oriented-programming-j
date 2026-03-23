package com.java.oops.strings;

public class String2 {
    public static void main(String[] args) {
        String Str="Hello World";
        System.out.println(Str.substring(2,6));
        System.out.println(Str);
        String Str2=Str.concat(" from concat method");
        System.out.println("Str remains unchanged even after concat with Str2 : "+Str+" Str2= "+Str2);
        // charat() method acceses the char at the given index
        System.out.println(Str.charAt(3));
        // equals() methods checks weather two strings are equal or not it returns a boolean
        String Str3="hello world";
        System.out.println(Str.equals(Str3));
        System.out.println(Str.equalsIgnoreCase(Str3));

    }
}
