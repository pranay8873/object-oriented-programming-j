package com.java.oops;

public class customer {
    String name;
    String phoneNo;
    int age;
    String gender;
    int cos_Id;
    String email;
    String region;

    customer() {
        this.name = "unknown";
        this.phoneNo = "0";
        this.age = 0;
        this.gender = "-";
        this.cos_Id = 0;
        this.email = "Unknown";
        this.region = "Unknown";
    }

    customer(String name, String phoneNo, int age, String gender, int cos_Id, String email, String region) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
        this.cos_Id = cos_Id;
        this.email = email;
        this.region = region;
    }
    customer(String name,String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = 0;
        this.gender = "-";
        this.cos_Id = 0;
        this.email = "Unknown";
        this.region = "Unknown";
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
}
