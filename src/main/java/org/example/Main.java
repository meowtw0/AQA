package org.example;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        System.out.println(Faker.instance().address());
    }
}