import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int len = String.valueOf(k).length();
        int num = 0;
        for(int i = 0; i <= len; i++){
            int temp = k%10;
            k = k/10;
            if (temp%2 == 0) {
                num+=temp;
                
            }
        }
        System.out.println(num);    
    }
    
}
