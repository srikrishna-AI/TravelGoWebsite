import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer k = new StringBuffer(input);
        int s=0;
        
        for(int i=0;i < k.length();i++){
            for(int j=k.length()-1-i;j>=0;j++)
            {
                if(k.charAt(i) == k.charAt(j)){
                    s++;

                }
                break;
            }
            
        }
        if(s == k.length()){
            System.out.print("it is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    
}
}
