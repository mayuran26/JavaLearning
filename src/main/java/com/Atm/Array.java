package com.Atm;

public class Array {


    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 60};

        System.out.println("find the average");

        int size = array.length;
        int i = 0;
        int sum = 0;
        while (i < size) {

            sum = sum +array[i];
            i++;
        }
        System.out.println("sum number:"+sum);
        System.out.println("Average is :" + sum/size);

    }
}
