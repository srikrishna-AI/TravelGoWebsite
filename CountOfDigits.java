import java.util.Scanner;

public class CountOfDigits {
    public static void main(String[] args) {
        System.out.println("enter a number to count :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = String.valueOf(a).length();
        System.out.println(count);

    }
    
}
