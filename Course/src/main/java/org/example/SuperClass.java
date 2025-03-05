package org.example;

class Computer{
    public Computer(){
        System.out.println("in A");
    }
    public Computer(int a){

        System.out.println("in A computer");
    }
}
class Laptop extends Computer{
    public Laptop(){
        super(6);
        System.out.println("in B");
    }
    public Laptop(int a){
        this();
        System.out.println("in B computer");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop(5);
        //Computer obj2 = new Computer();
    }

}
