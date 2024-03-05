package com.day3Practice.Atm;

public  class AccountBook {
    int accountAmount= 100000;

    void widthdrowel( int amount){

        accountAmount = accountAmount-amount;
        System.out.println("Your current account balance is : "+ accountAmount);
    }

    void deposit(int amount){

        accountAmount = accountAmount+amount;
        System.out.println("Your current account balance is : "+ accountAmount);
    }
    void accountBalance(){
        System.out.println("Your account balance is :"+accountAmount);
    }
}
