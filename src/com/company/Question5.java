package com.company;

public class Question5 {
    //5 Question
    public int TwoMatrixSum(int[][] a, int[][] b, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
