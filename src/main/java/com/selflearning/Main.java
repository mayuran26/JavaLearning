package com.selflearning;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();
        animal.walking();

        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sleep();
            dog.walking();
        }




    }
}
