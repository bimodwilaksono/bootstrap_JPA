package com.enigma;

import com.enigma.config.Factory;
import jakarta.persistence.EntityManager;

/**
 * Hello world!
 */
public class App {
    static EntityManager entityManager = Factory.start();

    //Connect Service

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
