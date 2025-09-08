import java.util.Scanner;

public class SpecialNumbers {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
        
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fin = factorial(num);
        int len = String.valueOf(fin).length();
        int original = num;
        int k = 0;
        for(int i=0;i<=len;i++){
            int temp = fin%10;
            fin = fin/10;
            k+=temp;


        }
        System.out.println(k);
        
    }
    
}
