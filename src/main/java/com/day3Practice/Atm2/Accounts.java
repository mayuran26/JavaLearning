package com.day3Practice.Atm2;

public class Accounts {
int totalAmount = 300000;

    void credit(int amount){

        totalAmount = totalAmount-amount;
        System.out.println("Your current account balance is :" +totalAmount);

    }

    void  debit(int amount){
        totalAmount = totalAmount+amount;
        System.out.println("your account balance is :"+totalAmount);
    }

    void statement(){
        System.out.println("your account statement is :"+totalAmount);
    }

}
