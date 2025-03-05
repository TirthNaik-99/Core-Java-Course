package org.example;

public class TypeCasting {
    public static void main(String[] args){
         //byte b = 127;
         int a = 12;
         byte k = (byte) a; //type casting
        System.out.println(a);

        int b = 756;
        byte j = (byte) b;
        System.out.println(j);

        float f = 5.6f;
        int t = (int) f; //for float data type
        System.out.println(t);

        //Type promotion
        byte x = 10;
        byte y = 30;
        int result = x * y;
        System.out.println(result);

    }
}
