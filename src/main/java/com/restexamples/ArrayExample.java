package com.restexamples;

public class ArrayExample {




    int[] createArray(){
        int[] array = new int[5];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        return array;

    }
    void getValueFromArray(int array[], int x){

        if( x>=0 && x<array.length){
            System.out.println("array index is "+x);
            System.out.println("value of the index is :" +array[x]);
            System.out.println("location for the array"+ array);
        }else {
            System.out.println("Index out of bound error");
        }



    }



}
