import java.util.Scanner;

public class RotateArray {
     public static void rotate(int[] a,int k){
        k = k%a.length;
        if(k<0){
            k = k+a.length;
        }

        reverseArray(a, 0, a.length-1);
        reverseArray(a, 0, k-1);
        reverseArray(a, k, a.length-1);   
     }
     public static void reverseArray(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start]; 
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        

     }

     public static void main(String[] args) {
        RotateArray ob = new RotateArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int s[] = new int[size];
        System.out.println("enter elemnts of array:");
        
        for(int i=0;i<s.length;i++){
            s[i] = sc.nextInt();
        }
        System.out.println("enter the k size:");
        int p = sc.nextInt();
        
        System.out.print("the rotate array is:");
        ob.rotate(s, p);
        for(int i=0;i<s.length;i++){
            System.out.print(" "+s[i]);
        }
     }
    
}
