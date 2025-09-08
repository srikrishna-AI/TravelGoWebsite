import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr the three subjects marks");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        if (s1>=35 && s2>=35 && s3>=35) {
            System.out.println("Pass");
            
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
