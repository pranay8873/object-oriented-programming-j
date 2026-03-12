package com.java.oops;

public class ordermain {
    public static void main(String[] args) {
        order o1=new order();
        System.out.println("order object without passing arguments : ");
        System.out.println("Name of ordered person : "+o1.name);
        System.out.println("order Id : "+o1.id);
        System.out.println("order category : "+o1.category);
        System.out.println("Ordered brand : "+o1.brand);
        System.out.println("Cost of order : "+o1.price);
        System.out.println("Rating for order : "+o1.rating);
        System.out.println("Weight of order : "+o1.weight);
        order o2=new order("pranay",30,"clothes","Max",499.50,4.5f,500);
        System.out.println("order object without passing arguments : ");
        System.out.println("Name of ordered person : "+o2.name);
        System.out.println("order Id : "+o2.id);
        System.out.println("order category : "+o2.category);
        System.out.println("Ordered brand : "+o2.brand);
        System.out.println("Cost of order : "+o2.price);
        System.out.println("Rating for order : "+o2.rating);
        System.out.println("Weight of order : "+o2.weight);

    }

}
