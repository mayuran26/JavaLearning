package com.day4;

public class MaximumValue {


    public static void main(String[] args) {

        int [] array = {3,2,1000,1,9};
        int max = array[0];

        for(int i=0;i<array.length;i++)

        {
            if (array[i]>max){
                max = array[i];

            }
/*
            if(array[i]>= array[i+1])
            {
                System.out.println("Maximum number is :");
            }
            else {
                System.out.println(array[i+1]);
                break;
            }*/
        }
        System.out.println(max);


    }



}
