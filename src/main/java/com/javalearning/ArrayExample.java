package com.javalearning;

public class ArrayExample {

    int[] array = new int[4];

    int[] callingArray(){
        array[0]= 11;
        array[1]= 19;
        array[2]= 20;
        array[3]= 30;
        return array;
    }

    void  getArrayValues(int array2[]){
        for (int values:array2
             ) {
            System.out.println("Array values: "+values);
        }

    }
    void getArrayIndexValues(int array[],int index){
        for (int indexValue:array
             ) {
            if (indexValue == array[index]) {
                System.out.println(indexValue);
            }
        }

    }
}
