import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int len = String.valueOf(num).length();
        int k = 0;
        int original = num;
        for(int i=0;i<=len;i++){
            int temp = num%10;
            num = num/10;
            k += Math.pow(temp, len);
            



        }
        if(k == original){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not Amstrong");
        }
    }
    
}
