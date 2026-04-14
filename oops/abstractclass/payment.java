package com.java.oops.abstractclass;

public abstract class payment {
    String name;
    int id;
    float amount;
    public payment(String name,float amount){
        this.name=name;
        this.amount=amount;
        System.out.println("name of customer : "+name);
        System.out.println("payment amount : "+amount);
    }
    public abstract void printdetailss();

}
