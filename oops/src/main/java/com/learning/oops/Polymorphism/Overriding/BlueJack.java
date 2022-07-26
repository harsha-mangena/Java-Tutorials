package com.learning.oops.Polymorphism.Overriding;

public class BlueJack  extends Animal{

    /**
     * A bird can do all the things that defined in animal, but can't crawl.
     */

    @Override
    public void Eat(){
        System.out.println("BlueJack : Eating");
    }

    @Override
    public void Drink(){
        System.out.println("BlueJack : Drinking");
    }

    @Override
    public void Sleep(){
        System.out.println("BlueJack : Sleeping");
    }

    @Override
    public void Fly(){
        System.out.println("BlueJack : Flying");
    }
}
