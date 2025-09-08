import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeSmall {
    public void maxMin(int[] a){
        int max = a[0];
        int min = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i] < min){
                min = a[i];
            }
            else if(a[i] > max){
                max = a[i];
            }
            
        }
        System.out.println(min);
        System.out.println(max);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LargeSmall ob = new LargeSmall();

        int n = sc.nextInt();
        int k[] = new int[n];
        for(int i=0;i<k.length;i++){
            k[i] = sc.nextInt();
        }
       ob.maxMin(k);
        sc.close();
    }
}
