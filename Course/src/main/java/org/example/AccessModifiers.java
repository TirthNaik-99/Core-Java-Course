package org.example;


class A{

    private int a;
    public A(int a){
        this.a = a;
    }
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    public B(int a) {
        super(a);
    }

    protected void B(int b){
        System.out.println("B");
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        A a = new A(5);
    }
}
