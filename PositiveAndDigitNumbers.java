import java.util.Scanner;

public class PositiveAndDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int len = String.valueOf(a).length();
        int orginal = a;
        int sum = 0;
        if(a>0){
            for(int i=0;i<=len;i++){
            int temp = a%10;
            a = a/10;
            sum += temp;
        }

        }
        if(sum%2 == 0){
            System.out.println("Valid user");
        }
        else{
            System.out.println("Invalid User");
        }
        
    }
    
}
