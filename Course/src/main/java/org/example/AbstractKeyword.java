package org.example;

//abstract class Bike{
//    public abstract void drive();
//    public void playMusic(){
//        System.out.println("Play music");
//    }
//}
//
//class Harley extends Bike{
//    public void drive(){
//        System.out.println("Harley drive");
//    }
//}

import static java.awt.Color.red;
import static java.awt.Color.yellow;

abstract class Shape{
    String model;
    abstract double Area();

    public void display(){
        System.out.println("Model of Shape : "+ model);
    }
 }
class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(String model, int length, int width) {
        this.length = length;
        this.width = width;
        this.model = model;
    }
    public double Area(){
        return length*width;
    }

    public void display(){
        System.out.println("Area of Rectangle : "+Area());
    }
 }

 class Circle extends Shape{
    int radius;
    public Circle(String model, int radius) {
         this.radius = radius;
         this.model = model;
     }


    public double Area(){
        return Math.PI*radius*radius;
    }
     public void display(){
         System.out.println("Area of circle : "+Area());
     }
 }


public class AbstractKeyword {
    public static void main(String[] args) {
//        Bike bike = new Harley();
//        bike.drive();
//        bike.playMusic();

        Shape rect = new Rectangle("Naik",5,6);
        Shape circle = new Circle("Devil",5);
        circle.display();

        rect.display();
    }
}
