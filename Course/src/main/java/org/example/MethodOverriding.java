package org.example;

class Mobile{
    public void model(){
        System.out.println("Nokia");
    }
    public void type(){
        System.out.println("touch screen");
    }
}

class SmartPhone extends Mobile{
    public void model(){
        System.out.println("IPhone 15");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.model();
    }
}
