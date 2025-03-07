package org.example;

public class MyString2 {
    public static void main(String[] args) {
//        String name = "Tirth";
//        System.out.println(name);
//        System.out.println(name.charAt(0));
//        System.out.println(name.concat("Naik"));
//
//        //Immutable
//
//        String s1 = "tirth";
//        String s2 = "Tirth";
//        System.out.println(s1 == s2);

        //StringBuffer and StringBuilder
        StringBuffer sb = new StringBuffer("Tirth");
        System.out.println(sb.capacity());

        sb.insert(0,"Mr. ");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Gopal");
        System.out.println(sb1);

        sb.insert(6,sb1);
        System.out.println(sb);
    }
}
