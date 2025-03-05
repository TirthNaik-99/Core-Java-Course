package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparableVsComparator {
    public static void main(String[] args) {


//        Comparator<String> com = new Comparator<String>(){
//            public int compare(String o1, String o2) {
//                char lastChar1 = o1.charAt(o1.length()-1);
//                char lastChar2 = o2.charAt(o2.length()-1);
//
//                return Character.compare(lastChar1, lastChar2);
//            }
//        };
//        List<String> names = new ArrayList<>();
//        names.add("Dev");
//        names.add("James");
//        names.add("Bob");
//        names.add("Jack");
//
//        Collections.sort(names, com);
//        System.out.println(names);

        Comparator<Students> com = new Comparator<Students>() {
            public int compare(Students s1, Students s2) {
                if (s1.age > s2.age) {
                    return 1;
                }else {
                    return -1;
                }
                }

        };
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(10, "John"));
        studs.add(new Students(20, "Jane"));
        studs.add(new Students(30, "Bob"));
        studs.add(new Students(40, "Tirth"));

        Collections.sort(studs, com);
        for (Students s : studs) {
            System.out.println(s);
        }
    }
}
