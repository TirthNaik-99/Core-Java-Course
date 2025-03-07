package org.example;

class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayAsObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Jane";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Bob";
        s3.marks = 40;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student stud : student) {
            System.out.println(stud.name + ":" + stud.marks);
        }
    }
}
