package com.day3Practice;

public class SumNumbersArrayWhileLp {


    public static void main(String[] args) {

        int[] arrray = {100,200,300,400};

        int i =0;
        int size = arrray.length;
        int sum =0;
        while (i <size){
            sum = arrray[i] +sum;
            i++;
        }
        System.out.println("Average of the array numbers is : " + sum/size);
    }
}
