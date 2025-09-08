import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PartyCruise {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of hours:");
        int time = sc.nextInt();
        
        int ele[] = new int[time];
        int last[] = new int[time];
        List<Integer> myList = new ArrayList<>();
        int temp= 0;
        System.out.println("enter the entery numbers");

        for(int i=0;i<time ;i++){
            ele[i] = sc.nextInt();

        }
        System.out.println("enter the exist numbers:");
        for(int i = 0;i< time;i++){
            last[i] = sc.nextInt();

        
        }
        for(int j=0;j<time;j++){

            temp += ele[j] - last[j];
            myList.add(temp);


        }
        
        System.out.println("the Remaining people are:"+Collections.max(myList));
    }
    
}
