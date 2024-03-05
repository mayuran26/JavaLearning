package com.day5Pracitce;

public class Main {

    static int ageFather =70;
    //final int ageFather=70;

    int ageSon= 30;


    public static void main(String[] args) {


        Main obj1 = new Main();

        Main obj2 = new Main();
        System.out.println("Age of son 3 years before :"+ obj1.ageSon);

        obj1.ageSon=33;

        Main.ageFather=72;
        //obj2.ageFather=71; not possible

        System.out.println("Age of son after 3 years :"+ obj1.ageSon);

        System.out.println("Age of father :"+ ageFather);



    }




}
