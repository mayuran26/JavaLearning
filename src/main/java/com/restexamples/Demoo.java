package com.restexamples;


abstract class Carrr{

    public abstract void drive();


    public void music() {

        System.out.println("playing the music");
    }
}

class Vww extends Carrr{

    public void drive() {
        //System.out.println("driving");
    }
}

public class Demoo {

    public static void main(String[] args) {

        Carrr cr = new Vww();
        cr.drive();
        cr.music();

    }
}
