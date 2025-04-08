import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        System.out.println("Enter a start number : ");
        Scanner scanner = new Scanner(System.in);
        //int start = scanner.nextInt();
        //int end = scanner.nextInt();
        int number = scanner.nextInt();

        Series obj = new Series();
//        obj.print(input);
//        obj.reverse(start,end);
//        obj.param(number, 0);
//        int sum = obj.func(number);
//        System.out.println("Sum is : " + sum);
        int n = obj.fact(number);
        System.out.println("Factorial is : " + n);


    }
}

class Series{
    int count = 0;

    public void print(int n){
        if (count > n ){
            return;
        }
        System.out.println(count);
        count++;

        print(n);
    }
    public void reverse(int i, int n){
        if (i < n){
            return;
        }
        System.out.println(i);
        reverse(i-1,n);
    }

    public void param(int i,int sum){
        if (i < 1){
            System.out.println(sum);
            return;
        }
        System.out.println(sum);
        param(i-1, sum + i);
    }

    public int func(int n){
        if(n == 0){
            return 0;
        }
        return n + func(n -1);
    }

    public int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }


}
