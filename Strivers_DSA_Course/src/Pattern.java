import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of stars in one line : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Enter the number of stars in one line : " + value);
        Patterns obj = new Patterns();
//        obj.print1(value);
//        obj.print2(value);
//        obj.print3(value);
//        obj.print4(value);
//        obj.print5(value);
        obj.print6(value);
    }
}

class Patterns{
    public void print1(int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void print2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }

    public void print3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }

    public void print4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
            System.out.println(" ");
        }
    }

    public void print5(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j >0; j--) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }

    public void print6(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");

            }
            System.out.println(" ");
        }
    }

    public void print7(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.println();
            }
        }
    }
}