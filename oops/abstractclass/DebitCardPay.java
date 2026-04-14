package com.java.oops.abstractclass;

public class DebitCardPay extends payment{
      public  DebitCardPay(String name,float amount){
          super(name,amount);
      }
    @Override
    public void printdetailss(){
        System.out.println("name "+name+"amount "+amount);
    }
}
