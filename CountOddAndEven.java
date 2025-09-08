import java.util.Scanner;

public class CountOddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        int even =0;
        int odd = 0;
        for(int i=0;i<6;i++){
            a[i] = sc.nextInt();

        }
        for(int i=0;i<6;i++){
            int temp = a[i];
            if (temp%2 == 0) {
                even++;
                
            }
            else{
                odd++;
            }
        }
        System.out.println("The no of evens is:"+even);
        System.out.println("the odd is :"+odd);
    }
    
}
