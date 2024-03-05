package com.day5.Array2;

import java.util.Arrays;

public class Main {

    int [] sortingMethod(int [] arry) {

        Arrays.sort(arry);
        return  arry;

    }
    // method - pass array
    //{ array 2} need to pass to main method

    public static void main(String[] args) {
        //array

        System.out.println("Defining the array :");
        int [] num= {12,33,2,36,1};

        Main main = new Main();

        System.out.println("Not shorted array : ");
        for(int i= 0; i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        int [] ar=main.sortingMethod(num);


        System.out.println("Shorted array is :" );{
            for (int j=0; j<ar.length;j++){
                System.out.println(ar[j]);
            }
        }


    }
}
