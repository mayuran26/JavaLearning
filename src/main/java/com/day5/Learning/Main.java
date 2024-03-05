package com.day5.Learning;

import javax.sound.midi.Soundbank;

public class Main{

 static int i =10;
 int j =20;

     public static void method(){

         System.out.println("Printing static method from method(): ");

     }
     public void meth(){
         i=5;
         System.out.println(i);
     }

     public static void main(String[] args) {
// if the static method in the same class
         Main obj1 = new Main();
         Main obj2 = new Main();
         method();
         Main2.method2();
         System.out.println("Printing i: "+i);
         System.out.println("printing the veriable from another class : "+ Main2.i);
         int val =obj1.j;

         obj1.j=50;
         int fatherAge= obj1.j;
         obj2.j=30;
         int son = obj2.j;

         System.out.println("J value is : "+val);

         System.out.println(fatherAge);
         System.out.println(son);






     }

 }