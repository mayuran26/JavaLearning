package com.day4.Students;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();
        for(; ;)
        {
            System.out.println("do you want to continue");
            System.out.println("Please enter the marks: ");
            int marks = sc.nextInt();

            if (marks >= 75) {
                calculation.methodA();
            } else if (marks >= 45 && marks < 75) {
                calculation.methodB();
            } else if (marks < 45) {
                calculation.methodF();

            } else {
                System.out.println("enter valid marks");
            }
        }
    }
}
