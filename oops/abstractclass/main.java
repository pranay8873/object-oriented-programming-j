package com.java.oops.abstractclass;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println("Enter amount : ");
        int amount= sc.nextInt();
        DebitCardPay pay=new DebitCardPay(name,amount);
        pay.printdetailss();

    }

}
