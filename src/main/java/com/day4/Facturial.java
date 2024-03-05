package com.day4;

import java.util.Scanner;

public class Facturial {

    void facturialCalc(int num){
        int sum=1;
        for(int i =num; i>0;i-- ){
            sum = sum*i;

        }
        System.out.println("Answer is :"+sum);

    }

    public static void main(String[] args) {
        Facturial fac = new Facturial();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ebter the number that you want to convert to facturial :");

        int num = sc.nextInt();
        System.out.println("cat of the numer :");
        fac.facturialCalc(num);




    }
}
