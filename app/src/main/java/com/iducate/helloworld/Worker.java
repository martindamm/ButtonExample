package com.iducate.helloworld;

/**
 * Created by martindamm on 29/02/16.
 */
public class Worker extends Person {
    float pay;

    public Worker (String name, int age, float pay){
        super(name, age);
        this.pay = pay;
    }

    public void printPerson() {
        System.out.println("Salary:" + pay);
    }
}
