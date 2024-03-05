package com.Atm;

import java.io.InputStream;
import java.util.Scanner;


public class Main {

    AccountBook accountBook = new AccountBook();

    void processAccountEnglish(Scanner sc){
        System.out.print("Please enter the Account process option as Widthdrow-1 or Deposit-2 or AccountBalance-3: ");

        int proaccValue = sc.nextInt();

        if (proaccValue == 1) {
            System.out.println("you have entered as Widthdrow: ");
            System.out.println(" Please enter the Widthdrow ammount :");
            int amountWidth = sc.nextInt();
            accountBook.widthdrow(amountWidth);

        }
        else if (proaccValue == 2) {
            System.out.println("you have entered as Deposit: ");
            System.out.println(" Please enter the Deposit ammount :");
            int amountDeposit = sc.nextInt();
            accountBook.deposit(20000);


        }else if (proaccValue == 3) {
            System.out.println("you have entered as AccountBalance: ");
            accountBook.accountBalance();

        }else {
            System.out.println("Please enter the valid input :");
        }
    }

    static void processAccountSinhala(Scanner sc){
        System.out.print("Please enter the Account process option as Widthdrow-1 or Deposit-2 or AccountBalance-3: ");

        int proaccValue = sc.nextInt();

        if (proaccValue == 1) {
            System.out.println("you have entered as Widthdrow: ");
            System.out.println(" Please enter the Widthdrow ammount :");
            int amountWidth = sc.nextInt();



        }
        else if (proaccValue == 2) {
            System.out.println("you have entered as Deposit: ");

        }else if (proaccValue == 3) {
            System.out.println("you have entered as AccountBalance: ");

        }else {
            System.out.println("Please enter the valid input :");
        }
    }
    static void processAccountTamil(Scanner sc){
        System.out.print("Please enter the Account process option as Widthdrow-1 or Deposit-2 or AccountBalance-3: ");

        int proaccValue = sc.nextInt();

        if (proaccValue == 1) {
            System.out.println("you have entered as Widthdrow: ");


        }
        else if (proaccValue == 2) {
            System.out.println("you have entered as Deposit: ");

        }else if (proaccValue == 3) {
            System.out.println("you have entered as AccountBalance: ");

        }else {
            System.out.println("Please enter the valid input :");
        }

    }

    public static void main(String[] args) {

        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the language options : Option 1 for English, Option 2 for Sinhala, Option 3 for Tamil: ");

        int option = sc.nextInt();

        for(; ;){
            System.out.println("Do you want to continue : y or n: ");
            String userInput = sc.next();
            if(userInput.equalsIgnoreCase("y")) {
                switch (option) {
                    case 1:
                        System.out.println("you have selected language as English: ");

                        main.processAccountEnglish(sc);

                        break;
                    case 2:
                        System.out.println("you have selected language as Sinhala: ");
                        main.processAccountSinhala(sc);
                        break;
                    case 3:
                        System.out.println("you have selected language as Tamil: ");
                        main.processAccountTamil(sc);
                        break;

                    default:
                        System.out.println("please enter valid input");
                        break;
                }
            }else {
                break;
            }
        }
/*
        if (option == 1 ){

            System.out.println("you have selected language as English: ");
            main.processAccountEnglish(sc);

        }else if(option == 2){
            System.out.println("you have selected language as Sinhala: ");
            main.processAccountSinhala(sc);
        } else if (option == 3) {

            System.out.println("you have selected language as Tamil: ");
            main.processAccountTamil(sc);
        }else {
            System.out.println("Please enter the valid option again");
        }
*/
    }

}
