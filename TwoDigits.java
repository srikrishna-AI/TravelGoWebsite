import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num%10;
        num = num/10;
        int c  = a+num;
        System.out.println(c);
    }
    
}
