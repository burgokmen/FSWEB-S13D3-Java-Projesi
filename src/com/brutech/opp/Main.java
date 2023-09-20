package com.brutech.opp;

public class Main {
    public static void main(String[] args) {

        Person person11 = new Person("Bruno", "Gokmen", 34);
        System.out.println(person11.getFirstName());
        System.out.println(person11.getLastName());
        System.out.println(person11.getAge());
        System.out.println(person11.isTeen());
        Person person7 = new Person("kucuk", "Gokmen", 15);
        System.out.println("-------------");
        System.out.println(person7.isTeen());
        System.out.println("-------------");
        System.out.println("Firstname: " + person11.getFirstName());

        System.out.println("LastName: " + person11.getLastName());

        System.out.println("Age: " + person11.getAge());
        System.out.println("-------------");
        System.out.println("Firstname: " + person7.getFirstName());

        System.out.println("LastName: " + person7.getLastName());

        System.out.println("Age: " + person7.getAge());
        System.out.println("-------------");



    }
}