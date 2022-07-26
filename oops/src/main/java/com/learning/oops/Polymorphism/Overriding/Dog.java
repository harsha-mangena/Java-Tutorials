package com.learning.oops.Polymorphism.Overriding;

public class Dog extends Animal{

    /**
     * A dog can eat, sleep, dring but can't fly.
     */
    @Override
    public void Eat(){
        System.out.println("Dog : Eating");
    }

    @Override
    public void Drink(){
        System.out.println("Dog : Drinking");
    }

    @Override
    public void Sleep(){
        System.out.println("Dog : Sleeping");
    }

    /**
     * As we can see the the same methods have been in the base class and have been used in different form at different scenario
     */
    
}
