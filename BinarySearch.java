import java.sql.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {3,2,4,5,8,7,10};
        int target = 7;
        Arrays.sort(a);
        int low = 0;
        int high = 6;
        while(low<=high){ 
            int mid = (low+high)/2;
            if(a[mid] == target){
                System.out.println(mid);
                break;
            }
            else if (a[mid] < target) {
                low = mid+1;
                
            }   
            else{
                high = mid-1;
            }

        }
    }
    
}
