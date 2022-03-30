package com.michal.kuc;

public class Square implements IFigure {
    private double side;

    Square(double n){
        side = n;
    }

    public double circumference(){
        return 4 * side;
    }

    public double area(){
        return side * side;
    }

    public void scaleUp(){
        side *= Math.sqrt(2);
    }

    public void scaleDown(){
        side /= Math.sqrt(2);
    }

    public String toString(){
        return "Square " + String.format("%.2f", side);
    }
}
