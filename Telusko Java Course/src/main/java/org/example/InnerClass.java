package org.example;

class X{
    int age;
    public X(int age){
        this.age = age;
    }
    public void Age(){
        System.out.println(age);
    }
    class Y{
        String name;
        public Y(String name){
            this.name = name;
        }



        public void Name(){
            System.out.println(name);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        X obj = new X(1);
        obj.Age();
        X.Y obj1 = obj.new Y("Tirth");
        obj1.Name();
    }
}
