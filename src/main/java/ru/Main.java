package ru;

import rand.RandomDate;
import rand.RandomDateProcessor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        RandomDateProcessor.processRandomDate(myClass);
        System.out.println(myClass.getDate());
        System.out.println(myClass.getDate1());
        System.out.println(myClass.getLocalDate());

    }
}