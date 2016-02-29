package com.iducate.helloworld;

import java.util.ArrayList;

/**
 * Created by martindamm on 22/02/16.
 */
public class Person {

    String name;
    int age;

    // This is the constructor of the class Person
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    // Method containing an if-else statement.
    public boolean isOld() {
        if(age >= 40){
            return true;
        } else {
            return false;
        }
    }

    // Print the Person details
    public void printPerson() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);

        // prints the isOld() method
        if(isOld()) {
            System.out.println("Person is old");
        } else {
            System.out.println("Person is young");
        }
    }
}
