package com.learning.oops.Polymorphism.Overloading;

public class Area {
    /**
     * Let us know another type of polymorphism here -> Overloading.
     * Overloading -> same definition, but different parameters types, and length of parameters.
     * 
     * Let's assume that we have to calculate area of different objects like square, circle etc..
     */

     /**
      * Calculates the area for Square.
      * @param x
      * @return
      */
     public int calculate(int x){
        return x*x;
     }

     /**
      * Calculates the area for rectangle.
      */
      public int calculate(int x, int y){
        return x*y;
      }

    public static void main(String[] args) {
        Area square = new Area();
        System.out.println(square.calculate(1));

        Area rectangle = new Area();
        System.out.println(rectangle.calculate(2, 3));
    }

    /**
     * Another classic example of overloading is the Operator overloading, + -> can be used with int, float, string....
     * 1+2,
     * 1.000+2.55;
     * "Harsha" + "Mangena"
     * 
     * 
     * 
    //    Must have a different parameter list.
    //    May have different return types.
    //    May have different access modifiers.
    //    May throw different exceptions.

    Note : Main can be overloaded.
     */
}
