import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    System.out.print("enter the size of array:");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements:");
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0;i<arr.length-1;i++){
        int swap = 0;

        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j+1]<arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                swap = 1;
            }
        }
        if(swap == 0){
            break;
        }
    }
    System.out.println("the sorted array is:");
    for(int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
    }
    }
    
}
