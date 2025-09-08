import java.util.Scanner;

public class ReplaceOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();
        sb = sb.toLowerCase();
        StringBuffer s = new StringBuffer(sb);

        

        //char a = sc.next().toLowerCase().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u' ){
                s.setCharAt(i, '$');

            }


        }

        System.out.println(s);
    }
    
}
