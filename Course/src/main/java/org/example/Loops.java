package org.example;

public class Loops {
    public static void main(String[] args){

        //While loop
        int i = 1;

        while(i <= 6){
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

        //do while loop
        int a = 5;

        do{
            System.out.println("Hello " + a);
            a++;
        }while(a < 4);
    }
}
