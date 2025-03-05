package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println( num);
    }
}
