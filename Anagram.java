import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
       
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sortedArray1 = new String(charArray1);
        String sortedArray2 = new String(charArray2);

        if(s1.length() == s2.length()){

            if(sortedArray1.equals(sortedArray2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }



            
        }
    }
    
}
