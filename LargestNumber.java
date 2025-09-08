import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        int large = 0;
        for(int i=0;i<6;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<6;i++){
            if(large<a[i]){
                large = a[i];

            }
           

        }
        System.out.println("the largest number is:"+large);
    }
    
}
