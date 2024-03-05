package com.day5.Temperature;

import java.util.Scanner;

public class Main {

    int convert(int celsius){

        int fahrenheit = ((celsius*9)/5)+32;

        return fahrenheit;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the value to convert celsius to fahrenheit: ");

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        Main main = new Main();
        System.out.println("fahrenheit value is: "+main.convert(userInput)+ " F");




    }
}
