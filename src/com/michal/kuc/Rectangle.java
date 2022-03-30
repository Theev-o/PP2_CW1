package com.michal.kuc;

public class Rectangle implements IFigure {
    private double sideA;
    private double sideB;

    Rectangle(double nA, double nB) {
        sideA = nA;
        sideB = nB;
    }

    public double circumference() {
        return (2 * sideA) + (2 * sideB);
    }

    public double area() {
        return sideA * sideB;
    }

    public void scaleUp() {
        sideA *= Math.sqrt(2);
        sideB *= Math.sqrt(2);
    }

    public void scaleDown() {
        sideA /= Math.sqrt(2);
        sideB /= Math.sqrt(2);
    }

    public String toString() {
        return "Rectangle: " + String.format("%.2f", sideA) + " x " + String.format("%.2f", sideB);
    }
}
