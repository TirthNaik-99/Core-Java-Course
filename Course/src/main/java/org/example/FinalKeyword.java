package org.example;

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public void show(){
        System.out.println("Credits by Tirth");
    }
}

class AdvCalc extends Calc{
    public int sub(int a, int b){
        return a-b;
    }
    public void show(){
        System.out.println("Credits by Tirth");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        AdvCalc advCalc = new AdvCalc();
        advCalc.show();
    }
}
