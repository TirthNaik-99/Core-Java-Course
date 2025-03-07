package org.example;

class Human{
    private int age;
    private String name;

    public Human() {
        this.name= "Tirth";
        this.age= 18;
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human(15, "naik");
        Human human3 = new Human();
        human.getAge();
        human.getName();

        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human2.getName() + " : " +human2.getAge());
    }
}
