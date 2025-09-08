import java.util.Scanner;

public class SplitingOfWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch) && i != 0){
                result.append(' ');
            }
            result.append(Character.toLowerCase(ch));
        }
        System.out.println(result);
    }
    
}
