public class MIssingNumber {
    public static void main(String[] args) {
        int n = 6;
        int a[] = {1,2,3,6,7};
        int natural = (n*(n+1))/2;
        int total =0;
        for(int i = 0; i <= n-1;i++){
            total += a[i];
            

        }
        int missing = natural-total;
        System.out.println(missing);
        
    }
    
}
