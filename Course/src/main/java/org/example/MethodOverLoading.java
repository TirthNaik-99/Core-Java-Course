package org.example;

class Mathematics{
    public int add(int n1, int n2){  //n1 and n2 are local variable
        //int r = n1 + n2;
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        //int s = n1 + n2 + n3;
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        //double t = n1 + n2;
        return n1 + n2;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Mathematics obj = new Mathematics();
        double result = obj.add(1, 2, 8 );
        System.out.println(result);

    }
}
