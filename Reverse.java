import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String Join = "";
        int len = String.valueOf(k).length();
        for(int i=1;i<=len;i++){
            int temp = k%10;
            k = k/10;
            Join = Join+temp;
        }
        int Final = Integer.parseInt(Join);
        System.out.println(Final);

        
    }
    
}
