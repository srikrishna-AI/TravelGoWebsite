import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num = scan.nextInt();
        int len = String.valueOf(num).length();
        int k = 0;
        for(int i=0;i<=len;i++){
            k += num%10;
            num = num/10;
        }
        System.out.println(k);

    }
    
}
