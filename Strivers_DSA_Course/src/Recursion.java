import java.util.Scanner;

public class Recursion {
    public static void main(String[] args){
        System.out.println("Enter a start number : ");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        Series obj = new Series();
//        obj.print(input);
        obj.reverse(start,end);

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


}
