package com.brutech.opp;

public class Person {
    String firstname;
    String lastname;
    int age;
    boolean isDev;
    String[] children;
    double someDouble;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, boolean isDev, String[] children, double someDouble) {
        this(firstname,lastname,age);
        this.isDev = isDev;
        this.children = children;
        this.someDouble = someDouble;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >12 && 20 > age;
    }

}
