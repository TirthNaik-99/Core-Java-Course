package org.example;

public class MultidimensionalArray {
    public static int[][] rotate90(int[][] matrix) {
        int N = matrix.length;
        int[][] newMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                newMatrix[j][i] = matrix[N - j - 1][i];
            }

        }
        return newMatrix;
    }
    }


