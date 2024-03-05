package com.Atm;

import javax.sound.midi.Soundbank;

public class AccountBook {
    int accountNumber= 123;
    String accountName= "mayuSaving";
    int accountBalance= 200000;

    void widthdrow(int amount){

        accountBalance = accountBalance - amount;

        System.out.println("Thanks for the widthdrowal and your current balance is : "+accountBalance);

    }

    void deposit(int depAmount){
        accountBalance = accountBalance+depAmount;

        System.out.println("Thanks for the Deposit and your current balance is : "+accountBalance);

    }

    void accountBalance(){

        System.out.println("You current account balance is :" + accountBalance);

    }


}
