package com.day5Pracitce;

import java.util.Arrays;

public class SortArray {



    public static void main(String[] args) {

        int [] array = {80,20,34,50};

        Arrays.sort(array);

        /*for(int i=0; i<array.length;i++) {
            System.out.println("Sorted array is :" + array[i]);

        }*/

        for(int i: array){
            System.out.println(i);
        }


    }
}
