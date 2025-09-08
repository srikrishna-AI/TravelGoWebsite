import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6];
        for(int i=0;i<6;i++){
            a[i] = sc.nextInt();

        }
        System.out.println("the reverse of a number:");
        for(int i=5;i>=0;i--){
            System.out.println( a[i]);
            
        }
    }
    
}
