package com.day3Practice;

public class SumNumbersArrayForLp {



    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};

        int i= 0;
        int sum=0;
        int size = numbers.length;
        for(int j= 0; j<size; j++)
        {
            sum =sum +numbers[j];

        }
        System.out.println("printing the average :" + sum/size);


    }
}
