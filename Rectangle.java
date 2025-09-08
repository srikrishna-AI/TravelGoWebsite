import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length:");
        int l = scan.nextInt();
        System.out.println("enter the breadth:");
        int b = scan.nextInt();
        System.out.println("the area of the rectangle is\t"+(l*b));
        System.out.println("the premeter of rectangle is:\t"+(2*(l+b)));
    }
    
}
