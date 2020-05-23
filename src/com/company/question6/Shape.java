package com.company.question6;

public abstract class Shape {
    protected double width;
    protected double height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected void setSize(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract String name();


}
