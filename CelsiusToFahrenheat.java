import java.util.Scanner;

public class CelsiusToFahrenheat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c,f;
        System.out.println("enter the celsius heat");
        c = scan.nextDouble();
        System.err.println("the faherinheat is:\t"+((c*(9/5))+32));

    }
    
}
