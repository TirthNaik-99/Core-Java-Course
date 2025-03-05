package org.example;

class Maths{
    public int add(int a, int b){
        int r = a + b;
        return r;
    }
    public int subtract(int c, int d){
        int s = c - d;
        return s;
    }

    public String giveMeAPen(int cost) {
        if (cost >= 10) {
            return "pen";
        }else{
            return "Sorry";
        }
    }
}

public class Methods {
    public static void main(String[] args){
        int num1 = 19;
        int num2 = 10;

        Maths maths = new Maths();
        int result = maths.add(num1, num2);
        int result2 = maths.subtract(num1, num2);
        System.out.println(result);
        System.out.println(result2);

        String str = maths.giveMeAPen(9);
        System.out.println(str);

    }
}
