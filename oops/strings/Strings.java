package com.java.oops.strings;

import java.util.Scanner;

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
        System.out.println(name2.toUpperCase());
        System.out.println(name2);
        name2=name2.toUpperCase();
        System.out.println(name2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Your initial credentials are : ");
        System.out.println("User name : user1256");
        System.out.println("Password : Password@cse");
        System.out.println("Enter user name : ");
        String userName=sc.nextLine();
        System.out.println("Enter password : ");
        String password=sc.nextLine();
        if(userName.equals("user1256") && password.equals("Password@cse")){
            System.out.println("Set your new Username And Password : ");
            System.out.println("User name : ");
            userName= sc.nextLine();
            System.out.println("Password : ");
            password=sc.nextLine();
            System.out.println("Your Updated Credentials are : ");
            System.out.println("username: "+userName);
            System.out.println("Password: "+password);
        }else {
            System.out.println("Entered Wrong Credentials retry!!");
        }



    }
}
