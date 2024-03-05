package com.day4;

public class FillingArrayToMethod {


    void refillingNewArray(int [] val){
        int [] newArray= new int[val.length];
        System.out.println("Passed the value to Method1 :");
        for(int i= 0; i< newArray.length; i++){
            newArray[i] = val[i];
            System.out.println("New Array :"+newArray[i]);
        }
    }

    public static void main(String[] args) {

        int [] array1 ={3,5,6,7,9};

        FillingArrayToMethod fillingArrayToMethod = new FillingArrayToMethod();
        fillingArrayToMethod.refillingNewArray(array1);



    }
}
