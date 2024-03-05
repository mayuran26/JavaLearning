package com.restexamples;

public class Example1 {

        static int x = 11;
        private int y = 33;
        public void method1(int x)
        {
           Example1 t = new Example1();
            this.x = 22;
            y = 44;

            System.out.println("Test.x: " + Example1.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
            Example1 t = new Example1();
            t.method1(5);
        }

    }


