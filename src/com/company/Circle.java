package com.company;

/**
 * Created by bb222 on 10/4/18.
 */
public class Circle {
    //declaring a state variable aka property
    public double radius;

    //constructor:
    public Circle(double r){
        radius = r;

    }

    public double circumference (){
        double c = 2 * Math.PI * radius;
        return c;
    }

    public double area (){
        double a = Math.PI * Math.pow(radius, 2);
        return a;
    }



}
