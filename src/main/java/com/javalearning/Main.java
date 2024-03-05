package com.javalearning;

public class Main {

    public static void main(String[] args) {

        ArrayExample arrayObj = new ArrayExample();
        int returnArray[] = arrayObj.callingArray();
        System.out.println(returnArray);
        arrayObj.getArrayValues(returnArray);
        arrayObj.getArrayIndexValues(returnArray,2);



    }
}
