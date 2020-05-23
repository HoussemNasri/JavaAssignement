package com.company.question6.ui;

import com.company.question6.Rectangle;
import com.company.question6.Shape;
import com.company.question6.Square;

import java.util.List;
import java.util.Scanner;

public abstract class ShapeSolver {

    protected Scanner scanner = new Scanner(System.in);

    protected int selectedOperation = -1;
    protected int selectedShape = -1;


    public abstract void startSolver();

    boolean isSupportedOperation(int operation) {
        return operation > 0 && operation < 3;
    }


    boolean isSupportedShape(int shape) {
        return shape > 0 && shape < 3;
    }


}
