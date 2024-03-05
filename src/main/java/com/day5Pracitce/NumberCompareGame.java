package com.day5Pracitce;

import java.util.Scanner;

public class NumberCompareGame {

     int number=80;
    void compareNum(Scanner sc) {


            for (; ; ) {
                System.out.println("Provide the number :");
                int num =sc.nextInt();
                System.out.println("are you above 18 years ? y or n");
                String answer = sc.next();
                if (answer.equalsIgnoreCase("y")) {

                    if (num > number) {
                        System.out.println("Entered number is Bigger than the defined number: ");
                    } else if (num == number) {
                        System.out.println("Entered number is equal to defined number: ");

                    } else if (num < number) {
                        System.out.println("Entered number is less than the defined number: ");
                    } else {

                        System.out.println("Entered the valid number: ");

                    }

                }else{
                    break;
                }

            }

    }

    public static void main(String[] args) {

        System.out.println("Enter the number to compare : ");
        Scanner sc = new Scanner(System.in);
        NumberCompareGame numberCompareGame = new NumberCompareGame();
        numberCompareGame.compareNum(sc);



    }
}
