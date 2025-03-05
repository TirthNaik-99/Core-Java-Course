package org.example;

class Calculator{                       //class
    public int add(int a, int b){
        int r = a +b;
        return r;
    }
}
public class ClassAndObject {
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 15;

        Calculator calc = new Calculator(); //object
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
