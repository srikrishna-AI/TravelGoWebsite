import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 1;
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            int temp = a[i];
            sum *= temp;


        }
        System.out.println("the product of numbers is:"+sum);

    }
    
}
