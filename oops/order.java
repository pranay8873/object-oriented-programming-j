package com.java.oops;

public class order {
    String name;
    int id;
    String category;
    String brand;
    double price;
    double rating;
    double weight;
    order() {
        this.name = "not defined";
        this.id = 0;
        this.category = "UnKnown";
        this.brand = "-";
        this.price = 0.0;
        this.rating = 0.0;
        this.weight = 0;
    }
    order(String name,int id,String category,String brand,double price,float rating,double weight){
        this.name=name;
        this.id=id;
        this.category=category;
        this.brand=brand;
        this.price=price;
        this.rating=rating;
        this.weight=weight;
    }
    order(String name,int id){
        this.name = name;
        this.id = id;
        this.category = "UnKnown";
        this.brand = "-";
        this.price = 0.0;
        this.rating = 0.0;
        this.weight = 0;

    }
    order(String name,int id,String category){
        this.name = name;
        this.id = id;
        this.category = "UnKnown";
        this.brand = "-";
        this.price = 0.0;
        this.rating = 0.0;
        this.weight = 0;

    }
    void print_data(){
        System.out.println("Name of ordered person : "+this.name);
        System.out.println("order Id : "+this.id);
        System.out.println("order category : "+this.category);
        System.out.println("Ordered brand : "+this.brand);
        System.out.println("Cost of order : "+this.price);
        System.out.println("Rating for order : "+this.rating);
        System.out.println("Weight of order : "+this.weight);
    }
    void change_name(String name){
        System.out.println("name changed from "+this.name+"to "+name);
        this.name=name;

    }

}


