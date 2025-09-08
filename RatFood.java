import java.util.Scanner;

public class RatFood {

    public void ratFood(int r,int unit,int[] nums){
        int food_sufficient = r*unit;
        int total = 0;
        int count =0;
        if(nums.length > 0){
            for(int i=0 ;i<nums.length;i++ ){
                total += nums[i];
                count++;
                if(total >= food_sufficient){
                    break;
                }
            }
            if(total >= food_sufficient){

                System.out.println(count);
            }
            else{
                System.out.println(0);
            }

        }
        else{
            System.out.println(-1);
        }
        
    }
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int r = sc.nextInt();
        int unit = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        RatFood ob = new RatFood();
        ob.ratFood(r, unit, arr);
        
    }
    
}
