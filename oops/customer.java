package com.java.oops;

public class customer {
    String name;
    String address;
    String phoneNo;
    int age;
    String gender;
    int cos_Id;
    String email;
    String region;

    customer() {
        this.name = "unknown";
        this.address="-";
        this.phoneNo = "0";
        this.age = 0;
        this.gender = "-";
        this.cos_Id = 0;
        this.email = "Unknown";
        this.region = "Unknown";
    }

    customer(String name,String address, String phoneNo, int age, String gender, int cos_Id, String email, String region) {
        this.name = name;
        this.address=address;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
        this.cos_Id = cos_Id;
        this.email = email;
        this.region = region;
    }
    customer(String name,String phoneNo) {
        this.name = name;
        this.address="-";
        this.phoneNo = phoneNo;
        this.age = 0;
        this.gender = "-";
        this.cos_Id = 0;
        this.email = "Unknown";
        this.region = "Unknown";
    }
    void change_address(String address){
        System.out.println("Address changed from "+this.address+" to "+address);
        this.address=address;
    }
    boolean c_status(){
        if(this.name.equals("unknown")){
            System.out.println("customer is inactive");
            return false;
        }else {
            System.out.println("customer is active ");
            return true;
        }


    }


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
}
