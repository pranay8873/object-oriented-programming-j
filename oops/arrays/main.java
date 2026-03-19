package com.java.oops.arrays;

public class main {
    public static void main(String[] args) {
        int[] ids;
        ids=new int[5];
        ids[0]=15;
        for (int id: ids){
//            int id=ids[index];
            System.out.println("value in id "+" "+id);
        }
        customer[] cu=new customer[5];
        cu[0]=new customer("pranay","karmanghat",8919836703L,20,"M",6699,"pranaypuvvati@gmail.com","India");
        cu[1]=new customer("prabhas","Jubli Hills",894567878L,50,"M",6659,"prabhas@gmail.com","India");
        cu[2]=new customer("vaishnavi","Saroonagar",834567788L,40,"F",6600,"vaishnavich@gmail.com","India");
        cu[3]=new customer("samuel","Mushrambagh",123456789L,30,"M",6690,"samuelsam@gmail.com","India");
        cu[4]=new customer("bt","Chennai",8121914849L,60,"M",6692,"kbt@gmail.com","India");
        cu[0].printCustomerDetails();
        for (customer c:cu){
            System.out.println("---------customer details-------------");
            c.printCustomerDetails();
        }

        customer result = customer.getCustomerById(cu,6699);

        if(result != null){
            System.out.println("Found customer Data : ");
            result.printCustomerDetails();
        }else{
            System.out.println("Customer not found");
        }
        for (int i=0;i<cu.length;i++){
            customer cuu=customer.getCustomerBelowAge(cu,50);
        }
    }

}
