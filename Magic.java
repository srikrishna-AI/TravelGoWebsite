import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        /*int len = String.valueOf(num).length();
        int fin = 0;*/
       while (num>9) {
        int sum = 0;
        while (num > 0) {
            sum += num%10;
            num = num/10;
        }
        num = sum;

       }
       if (num == 1) {
        System.out.println("Magic Number");
        
       }
       else{
        System.out.println("not magic");
       }
    }
    
}
