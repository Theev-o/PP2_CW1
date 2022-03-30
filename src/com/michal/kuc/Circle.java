package com.michal.kuc;


public class Circle implements IFigure {
    private double radius;


    Circle(double n){
        radius = n;
    }

    public double circumference(){
        return Math.PI * 2 * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void scaleUp(){
        radius *= Math.sqrt(2);
    }

    public void scaleDown(){
        radius /= Math.sqrt(2);
    }

    public String toString(){
        return "Circle: " + String.format("%.2f", radius);
    }
}
