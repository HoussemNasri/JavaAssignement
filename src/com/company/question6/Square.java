package com.company.question6;

public class Square extends Shape {
    private double side;
    public static final int SQUARE_ID = 1;
    public static final String SQUARE_NAME = "Square";

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(){
        super(0, 0);
    }

    public void setSide(double side) {
        this.side = side;
        setSize(side, side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String name() {
        return SQUARE_NAME;
    }

}
