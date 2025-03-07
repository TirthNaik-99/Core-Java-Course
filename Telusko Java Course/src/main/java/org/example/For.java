package org.example;

public class For {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++){
//            System.out.println("Day"+i);
//            for (int j = 1; j <= 9; j++){
//                System.out.println(" " + (j+8) + "-" +(j+9));
//            }
//        }

        // triangle
//        int rows = 5;
//        for (int i = 1; i >= rows; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //System.out.println();

        //inverted triangle
//        int row = 5;
//        for (int i = row; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //rectangle
//        int rows = 4;
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("x");
//            }
//            System.out.println();
//        }

        //numbers triangle
//        int rows = 5;
//        for (int i = rows; i >=1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //number triangle
//        int rows = 5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }


        //pyramid
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

