package com.restexamples;

import java.util.Scanner;

public class Main {

    void addition(int a, int b){
        int sum = a+b;
        System.out.println(sum);

    }
    void substraction(int c, int d){
        int value = c-d;
        System.out.println(value);

    }



    public static void main(String[] args) {
      //  System.out.println("Hello world!");

        /*Calculator cal = new Calculator();

        Scanner sc  = new Scanner(System.in);
        //sc.nextInt();
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        cal.addition(val1,val2);
        cal.substraction(val1,val2);
    }*/

       /* Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number1");
        int val1 = sc.nextInt();
        System.out.println("Enter the number2");
        int val2 = sc.nextInt();
        System.out.println("Enter the oporator");
        char oporator = (char) sc.next().charAt(0);
        Calculator cal = new Calculator();
        /*if(oporator == '+') {
            cal.addition(val1, val2);
        } else if (oporator =='-') {

            cal.substraction(val1,val2);
        }else if (oporator == '*') {

            cal.multiplication(val1,val2);
        }
        else {
            System.out.println("Invalid oporator");
        }*/
/*
        switch (oporator) {
            case '+': cal.addition(val1,val2);break;

            case '-': cal.substraction(val1,val2);break;

            case '*': cal.multiplication(val1,val2);break;
            default:System.out.println("Invalid oporator");
*/

            ArrayExample array = new ArrayExample();
           int array2[] = array.createArray();
            array.getValueFromArray(array2,3);

            Loops lop = new Loops();
            lop.fillingArray();
            lop.sumOf();
            lop.reverseArray();

        }

    }

