package com.iducate.helloworld;

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

    // Print the Person details
    public void printPerson() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}
