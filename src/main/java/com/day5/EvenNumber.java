package com.day5;

import java.util.Scanner;

public class EvenNumber {
int sum =0;
    void convertToEven(int value){
        for (int i= 0; i<=value; i++){
            if (i%2==0){
                sum = sum+i;
                System.out.println(i);

            }
        }
        System.out.println("sum of the even numbers is : "+sum);
    }


    public static void main(String[] args) {

        System.out.println(" Enter the number to get the even numbers :");

        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        EvenNumber evenNumber = new EvenNumber();
        evenNumber.convertToEven(num);





    }
}
