import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int len = String.valueOf(k).length();
        int original = k;
        String Join = "";
        
        for(int i=1;i<=len;i++){
            int temp = k%10;
            k = k/10;
            Join = Join+temp;

        }
        int num = Integer.parseInt(Join);
        if(original == num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        //System.out.println(num);
    }
    
}
