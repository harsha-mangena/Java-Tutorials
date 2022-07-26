package com.learning.oops.Abstraction.Interface;


/**
 * Interfaces are used to achieve the 100% abstraction.
 * All the public methods in the interface must be implemented by the classes implementing the interface.
 * Interface can have static, default methods.
 */
public interface DefaultInterface {
    
    public void runByImplementing();

    default void thisIsFromInterface(){
        System.out.println("Printing this from interface.");
    }
}
