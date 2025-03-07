package org.example;

public class Operator {
    public static void main(String[] args){

        //Arithmetic Operators
         int num1 = 10;
         int num2 = 20;

         int add = num1 + num2;  //addition operator
         int sub = num1 - num2;  //subtraction operator
         int mul = num1 * num2;  //multiplication operator
         int div = num2 / num1;  //division operator
         int mod = num1 % num2;  //modulus operator

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        int num = 7;
        int result1 = num++;
        int result2 = ++num;
        System.out.println(result1);
        System.out.println(result2);

        //Relational Operators
        int a = 5;
        int b = 6;

        boolean result3 = a > b;
        boolean result4 = a >= b;
        boolean result5 = a < b;
        boolean result6 = a <= b;
        boolean result7 = a == b;
        boolean result8 = a != b;

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);

        //Logical Operators
        int x = 7;
        int y = 5;
        int c = 5;
        int d = 9;

        boolean result9 = x > y || a > b;
        boolean result10 = x < y && a > b;
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(!result10);   //Not Operator
    }
}
