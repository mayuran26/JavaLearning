package com.day5Pracitce;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ShortArrayWithMethod {

    int [] getArray(int[] ary){

        Arrays.sort(ary);

        return ary;

    }

    public static void main(String[] args) {
        int array[] = new int[5];

        System.out.println("Enter the 5 numbers to keep it in the array:");

        Scanner sc = new Scanner(System.in);

        array[0]= sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4]= sc.nextInt();

        ShortArrayWithMethod shortArrayWithMethod = new ShortArrayWithMethod();
        System.out.println("Array value before shorting : ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        shortArrayWithMethod.getArray(array);

        System.out.println("Array value after shorting :");
        for(int j=0; j<array.length;j++){
            System.out.println(array[j]);
        }


    }
}
