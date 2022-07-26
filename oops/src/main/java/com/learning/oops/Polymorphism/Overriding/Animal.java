package com.learning.oops.Polymorphism.Overriding;


/**
 * Polymorphism -> the same entity (method or operator or object) can perform different operations in different scenarios.
 * 
 * For exmaple let us take a class called "Animal"
 * -> Animal can sleep, drink, eat, crawl.
 * -> Not all can walk(snake)
 * -> Not all can fly(hen :-/) and more..
 */
public class Animal {
    
    public void Sleep(){
        System.out.println("Animal : Sleeping");
    }

    public void Eat(){
        System.out.println("Animal : Eating");
    }

    public void Drink(){
        System.out.println("Animal : Drinking");
    }

    public void Crawl(){
        System.out.println("Animal : Crawling");
    }

    public void Fly(){
        System.out.println("Animal : Flying");
    }

}
