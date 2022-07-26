package com.learning.oops.Abstraction;

/**
 * In general an abstract class, have atleast one abstract method and the abstract methods will not have body apart from the definition.
 * The abstract class can have normal, final and static methods along with constructors.
 * The abstract class can't be initialized. 
 */
public abstract class Shape {
 
    public Shape(){
        // No args Constructor.
    }
    
    public abstract void dispalyShape();

}
