package com.iducate.helloworld;

/**
 * Created by martindamm on 29/02/16.
 */
public class Pensionist extends Person {
    int retirementYear;

    public Pensionist (String name, int age, int retirementYear){
        super(name, age);
        this.retirementYear = retirementYear;
    }

    public void printPerson() {
        System.out.println("Retirement Year:" + retirementYear);
    }
}
