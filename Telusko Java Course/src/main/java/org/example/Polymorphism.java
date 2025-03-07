package org.example;

//Dynamic Method Dispatch
class BlockOne{
    public void show(){
        System.out.println("A");
    }
}

class BlockTwo extends BlockOne{
    public void show(){
        System.out.println("B");
    }
}
class BlockThree extends BlockTwo{
    public void show(){
        System.out.println("C");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        BlockOne obj = new BlockOne();
        obj.show();

        obj = new BlockTwo();
        obj.show();

        obj = new BlockThree();
        obj.show();
    }
}
