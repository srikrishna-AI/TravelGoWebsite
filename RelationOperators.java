import java.util.Scanner;

public class RelationOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scan.nextInt();
        if(age>=18){
            System.out.println("Eglible");
            
        }
        else{
                System.out.println("Not Eligible");
        }
    }
    
}
