package org.example;

@FunctionalInterface
interface Picture{
    int add(int i, int j);
}
public class LambdaExpression {
    public static void main(String[] args) {
        Picture obj = (i,j) -> i+j;

        int result = obj.add(5,6);
        System.out.println(result);
    }

}
