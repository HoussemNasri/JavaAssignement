package com.company.question6;

public class Rectangle extends Shape {
    public static final int Rectangle_ID = 2;
    public static final String Rectangle_NAME = "Rectangle";
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public Rectangle() {
        super(0, 0);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String name() {
        return Rectangle_NAME;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
