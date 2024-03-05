package com.day3Practice;

public class SumNumbersArrayDoWhile {


    public static void main(String[] args) {
        int [] array = {120,130,230,100,700};

        int i =0;
        int sum =0;
        int size = array.length;

        do{
            sum = array[i]+sum;
            i++;
        }
        while(i<size);
        System.out.println("average number is : "+ sum/size);
    }

}
