package org.example;

class TirthException extends Exception {
    public TirthException(String message) {
        super(message);
    }
}
public class ExceptionThrowKeyword {
    public static void main(String[] args) {
//        int i = 0; // Divider
//        int j;

//        try {
//            if (i == 0) {
//                throw new ArithmeticException("Division by zero is not allowed.");
//            }
//            j = 18 / i; // This will not execute if i == 0
//        } catch (ArithmeticException e) {
//            j = 18 / 1; // Default value for j
//            System.out.println("Caught an exception: " + e.getMessage());
//        }

//Custom Exception
        int weight = 125;
        try {
            if (weight > 95) { // Check for overweight condition
                throw new TirthException("Overweight");
            }
        } catch (TirthException e) {
            System.out.println("Caught TirthException: " + e.getMessage());
        }
        System.out.println("bye");
    }
}
