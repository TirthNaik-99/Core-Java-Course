import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args){
        System.out.println("Enter the number you want to count : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Math obj = new Math();
//        int count = obj.counting(num);
//        System.out.println(count);
        int rev = obj.reverse(num);
        System.out.println(rev);

    }
}

class Math{
    public int counting(int n){
        int count = 0;
        while (n >0){
            int lastDigit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    public int reverse(int n){
        int rev = 0;
        while (n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n /10;
        }
        return rev;
    }
}
