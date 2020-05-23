package com.company.question6.ui;

import com.company.question6.Rectangle;
import com.company.question6.Shape;
import com.company.question6.Square;

public class CliShapeSolver extends ShapeSolver {

    @Override
    public void startSolver() {
        while (!isSupportedShape(selectedShape)) {
            System.out.println("Choose Shape :");
            System.out.println("1- Square");
            System.out.println("2- Rectangle");

            System.out.print("Answer : ");
            selectedShape = scanner.nextInt();
            System.out.println();
        }

        while (!isSupportedOperation(selectedOperation)) {
            System.out.println("Choose Operation :");
            System.out.println("1- Area");
            System.out.println("2- Perimeter");
            System.out.print("Answer : ");
            selectedOperation = scanner.nextInt();
            System.out.println();
        }
        Shape shape = null;
        System.out.println("Reading Selected Shape Information");

        if (selectedShape == Square.SQUARE_ID)
            shape = readSquareInformation();

        if (selectedShape == Rectangle.Rectangle_ID)
            shape = readRectangleInformation();

        if (shape != null) {
            if (selectedOperation == 1) {
                System.out.println(shape.name() + " Area is " + shape.calculateArea());
            }
            if (selectedOperation == 2)
                System.out.println(shape.name() + " Perimeter is " + shape.calculatePerimeter());
        }

    }

    public Square readSquareInformation() {
        Square square = new Square();
        System.out.print("Side : ");
        double side = scanner.nextDouble();
        square.setSide(side);
        return square;
    }

    public Rectangle readRectangleInformation() {
        Rectangle rectangle = new Rectangle();
        System.out.print("Width : ");
        double width = scanner.nextDouble();
        System.out.print("Height : ");
        double height = scanner.nextDouble();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        System.out.println();
        return rectangle;
    }
}
