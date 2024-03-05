package com.restexamples;

import java.security.spec.RSAOtherPrimeInfo;

public class Loops {
    int result=0;


    int [] array = new int[3];

     void fillingArray(){

         int []array2 = {2,4,6};

         for (int i=0; i<array.length;i++){
             array[i] = array2[i];
             int value = array2[i];
             //System.out.println(value);
             System.out.println("this will print the value: "+array[i]);
         }

    }

    void sumOf(){
        for (int sum:array) {
            result = result+sum;
        }
        System.out.println("total value is :"+result);
    }
    void reverseArray(){
        int newrArray;
         for(int j = array.length-1; j>=0;j--){
             newrArray =array[j];
             System.out.println("Reverse the array: "+ newrArray);
         }

    }

}
