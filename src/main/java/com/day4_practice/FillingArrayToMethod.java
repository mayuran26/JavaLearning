package com.day4_practice;

public class FillingArrayToMethod {

    void feedingArray(int[]a){
        for(int i=0;i<a.length;i++){
            System.out.println("======");
            System.out.println(a[i]);
        }

    }


    public static void main(String[] args) {

        int[] array ={12,45,65,23};

        FillingArrayToMethod fillingArrayToMethod = new FillingArrayToMethod();
        fillingArrayToMethod.feedingArray(array);

    }
}
