import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        char c = scan.next().charAt(0);
        b = scan.nextInt();
        //char  k ;
        if (c == '+'){
            System.out.println(a+b);

        }
        else if (c == '-') {
            System.out.println(a-b);
            
        }
        else if (c == '*') {
            System.out.println(c*b);
        }
        else if (c == '/') {
            System.out.println(a/b);
        }

    }
    
}
