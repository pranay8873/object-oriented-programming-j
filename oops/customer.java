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
    void print(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("phone number : "+this.phoneNo);
        System.out.println("Email : "+this.email);
        System.out.println("customer Id : "+this.cos_Id);
        System.out.println("Gender : "+this.gender);
        System.out.println("Region : "+this.region);
    }
    boolean c_status() {
        if (this.name.equals("unknown")) {
            System.out.println("customer is inactive");
            return false;
        } else {
            System.out.println("customer is active ");
            return true;
        }
    }
    void c_delete(){
            this.name = "unknown";
            this.address="-";
            this.phoneNo = "0";
            this.age = 0;
            this.gender = "-";
            this.cos_Id = 0;
            this.email = "Unknown";
            this.region = "Unknown";
        System.out.println("Deleted customer data");

        }


    }

