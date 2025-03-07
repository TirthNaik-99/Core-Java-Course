package org.example;

public class TryCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String s = null;

        try{
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(s.length());
        }catch(ArithmeticException e){
            System.out.println("Exception" + e);
        }catch(ArrayIndexOutOfBoundsException f){
            System.out.println("Exception" + f);
        }catch(NullPointerException n){
            System.out.println("Exception" + n);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
