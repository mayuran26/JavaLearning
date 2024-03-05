package com.day5;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int num = 50;

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Please enter the number that you want to compare :");
            int enteredNum = sc.nextInt();
            System.out.println("Do you want to continue the game : y or n");
            String val = sc.next();


            if (val.equalsIgnoreCase("y")) {


                if (num > enteredNum) {

                    System.out.println("Entered value is lessthan stored value: ");
                } else if (num == enteredNum) {
                    System.out.println("Entered number is equel to stored value :");

                } else if (num < enteredNum) {
                    System.out.println("Entered value is graterthan stored value: ");
                }
            } else {
                break;
            }

        }
            while (true) ;

        }
    }
