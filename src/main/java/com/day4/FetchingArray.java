package com.day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FetchingArray {


    public static void main(String[] args) {

        int [] num = new int[4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array values:");
        for(int j=0; j<num.length;j++){
            num[j] = sc.nextInt();
        }
        for(int i=0; i<num.length;i++) {
            System.out.print(num[i]);
        }
    }

}
