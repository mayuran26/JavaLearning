package com.day5.Array;

import java.util.Arrays;

public class Main {




    public static void main(String[] args) {

        int []num = {11,33,44,2,4};

        // how to sort the integer array
        Arrays.sort(num);

        for (int sort:num){

            System.out.println("Sorted array is :"+ sort);
        }

    }
}
