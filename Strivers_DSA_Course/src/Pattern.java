import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of stars in one line : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Enter the number of stars in one line : " + value);
        Patterns obj = new Patterns();
//        obj.print1(value);
        obj.print2(value);
    }
}

class Patterns{
//    public void print1(int n){
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    public void print2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}