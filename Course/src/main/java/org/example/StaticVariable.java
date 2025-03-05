package org.example;

class Car{
    String color;
    int price;
    String name;
    static String type;

    public void display() {
        System.out.println("The car name is " + name + " with " + color + " color and the price is " + price + " with type " + type);
    }
}

public class StaticVariable {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.color = "red";
        car1.price = 50000;
        car1.name = "BMW";
        car1.type = "SUV";


        Car car2 = new Car();
        car2.color = "Blue";
        car2.price = 100000;
        car2.name = "G Wagon";
        car2.type = "SUV";

        car1.type= "sedan";

        car1.display();
        car2.display();



    }
}
