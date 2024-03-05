package com.day3Practice.Atm;


import java.util.Scanner;

public class Main {

    static AccountBook ac = new AccountBook();
    static void processAccountEng(Scanner sc){
        System.out.println("Enter the option-1 to Widthrow option-2 deposit option-3 balance: ");
         int processAction = sc.nextInt();

         if(processAction ==1){
             System.out.println("You have selected widthrow: ");
             System.out.println("Enter the widthrow amount: ");
             int widthrowAmount = sc.nextInt();
             ac.widthdrowel(widthrowAmount);



         }else if(processAction == 2){
             System.out.println("You have selected deposit: ");
             System.out.println("Enter the deposit amount: ");
             int depositAmount = sc.nextInt();
        }
         else if(processAction == 3){
             System.out.println("You have selected balance: ");
             System.out.println("Show me the balance: ");
             int balance = sc.nextInt();

    }else{
            System.out.println("please enter the valid option: ");
         }
    }

    static void processAccountTamil(Scanner sc){

        System.out.println("Enter the option-1 to Widthrow option-2 deposit option-3 balance: ");
        int processAction = sc.nextInt();

        if(processAction ==1){
            System.out.println("You have selected widthrow: ");
            System.out.println("Enter the widthrow amount: ");
            int widthrowAmount = sc.nextInt();
            ac.widthdrowel(widthrowAmount);



        }else if(processAction == 2){
            System.out.println("You have selected deposit: ");
            System.out.println("Enter the deposit amount: ");
            int depositAmount = sc.nextInt();
        }
        else if(processAction == 3){
            System.out.println("You have selected balance: ");
            System.out.println("Show me the balance: ");
            int balance = sc.nextInt();

        }else{
            System.out.println("please enter the valid option: ");
        }

    }


    public static void main(String[] args) {

        System.out.println("Please enter the option-1: English option-2: Tamil option-3:Sinhala");
        Scanner sc = new Scanner(System.in);

        for (; ; )
        {
            System.out.println("do you want to continye? Y or N ? :");

            String userInput = sc.next();

            if (userInput.equalsIgnoreCase("y"))
            {

                int languageOption = sc.nextInt();

                switch (languageOption) {
                    case 1:
                        System.out.println("You have selected English language");
                        Main.processAccountEng(sc);
                        break;

                    case 2:
                        System.out.println("You have selected Tamil language");
                        Main.processAccountTamil(sc);
                        break;

                    default:
                        System.out.println("Please enter the valid language: ");


                }

            }



        }
    }
}
