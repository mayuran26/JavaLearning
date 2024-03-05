package com.day3Practice.Atm2;

import java.util.Scanner;

public class Main {


    Accounts ac = new Accounts();
    void transactionEnglish(Scanner sc){

        System.out.println("Please enter credit-1 , deposit-2 , accountstatement-3: ");
        int accountOption = sc.nextInt();

        if(accountOption ==1){
            System.out.println("plese enter the amount to credit :");
            int cresditAmount = sc.nextInt();
            ac.credit(cresditAmount);
        }
        if(accountOption ==2){
            System.out.println("plese enter the amount to debit :");
            int debitAmount = sc.nextInt();
            ac.debit(debitAmount);
        }
        if(accountOption ==3){
            System.out.println("thanks for choosing account statement: ");
            ac.statement();
        }

    }

    void transactionTamil(Scanner sc){
        System.out.println("Please enter credit-1 , debit-2 , accountstatement-3: ");
        int accountOption = sc.nextInt();

        if(accountOption ==1){
            System.out.println("plese enter the amount to credit :");
            int cresditAmount = sc.nextInt();
            ac.credit(cresditAmount);
        }
        if(accountOption ==2){
            System.out.println("plese enter the amount to debit :");
            int debitAmount = sc.nextInt();
            ac.debit(debitAmount);
        }
        if(accountOption ==3){
            System.out.println("thanks for choosing account statement: ");
            ac.statement();
        }

    }




    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select your language English option-1 Tamil option-2 Sinhala option-3: ");
        int languageOption = sc.nextInt();

        for(; ;)
        {
            System.out.println("Do you want to Continue? Y or N:");
            String input =sc.next();
            if(input.equalsIgnoreCase("y"))
            {


                switch (languageOption) {

                    case 1:
                        System.out.println("You have selected english language: ");
                        main.transactionEnglish(sc);
                        break;

                    case 2:
                        System.out.println("You have selected tamil language: ");
                        main.transactionTamil(sc);
                        break;

                    default:
                        System.out.println("Plz enter the valid langue option: ");
                        break;
                }
            }else {
                System.out.println("completed");
                break;
            }

        }





    }
}
