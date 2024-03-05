package com.day4_practice;

public class MaxNumber {


    public static void main(String[] args) {

        int [] array = {23, 4, 500,2,15};

        System.out.println("finding the max number: ");

        int max= array[0];
        for (int i=0; i<array.length;i++){

            if (max< array[i]){
                max=array[i];
            }

        }
        System.out.println("Max number is : "+max);
    }
}
