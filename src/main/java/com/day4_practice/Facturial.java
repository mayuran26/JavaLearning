package com.day4_practice;

import java.util.Scanner;

public class Facturial {

    public static void main(String[] args) {

        System.out.println("Please enter the number that you want to calculate the facturial:");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum=1;

        for(int i = num; i>0; i--){
            sum = sum*i;
        }
        System.out.println(sum);

    }
}
