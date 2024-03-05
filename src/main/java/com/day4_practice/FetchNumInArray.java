package com.day4_practice;

import java.util.Scanner;

public class FetchNumInArray {

    public static void main(String[] args) {

        System.out.println("Enter the numbers that you want to have it in array: ");

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        int []array = new int[value];

        System.out.println("Please enter the "+value + " numbers in your array: ");

        for(int i=0;i<value;i++){
            array[i]= sc.nextInt();
        }
        for (int j=0;j<value;j++){
            System.out.println("array is :" +array[j]);
        }
    }
}
