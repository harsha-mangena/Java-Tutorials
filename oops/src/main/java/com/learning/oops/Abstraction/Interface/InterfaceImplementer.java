package com.learning.oops.Abstraction.Interface;

public class InterfaceImplementer implements DefaultInterface {

    @Override
    public void runByImplementing() {
        System.out.println("This method is running from InterfaceImplementer class.");
    }
    
    public static void main(String[] args) {
        InterfaceImplementer obj = new InterfaceImplementer();
        obj.runByImplementing();
        obj.thisIsFromInterface();
    }
}
