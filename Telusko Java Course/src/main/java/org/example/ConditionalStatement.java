package org.example;

public class ConditionalStatement {
    public static void main(String[] args){
        //If else
        int num1 = 4;
        int num2 = 5;

        if(num1 > num2 )
            System.out.println("num 1 is greater than num 2");
        else
            System.out.println("num 2 is greater than num 1");


        //If else if

        int a = 6;
        int b= 8;
        int c = 9;

        if (a > b && a > c)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);

        //Switch Statements
        int n = 4;

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number");
        }

        //updated switch version

        String day = "Sunday";
        switch (day){
            case "Sunday" , "Saturday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        //we can use switch as an expression

//        String days = "Tuesday";
//        String result = "";
//        result = switch(days){
//            case "Sunday" , "Saturday" -> "6am";
//            case "Monday" -> "8am";
//            default -> "7am";
//        };
//        System.out.println(result);

        String days = "Tuesday";
        String result = "";
        result = switch(days){
            case "Sunday" , "Saturday" : yield "6am";
            case "Monday" : yield "8am";
            case "Tuesday" : yield "9am";
            default : yield "7am";
        };
        System.out.println(result);
    }
}
