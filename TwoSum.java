import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target value:");
        int target = sc.nextInt();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]+a[j])==target){
                    System.out.println("The index values or:"+i+" "+j);
                    
                }
            }
        }
    }
    
}
