import java.util.Scanner;

public class MoveToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the values");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        
        int index = 0;
        for(int i=0;i<size;i++){
            if(a[i] != 0){
                a[index++] = a[i];

            }
        }

        while(index<size){
            a[index++] = 0;
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
