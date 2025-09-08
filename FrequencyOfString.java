import java.util.Scanner;

public class FrequencyOfString {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char c =sc.next().toLowerCase().charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);

    }
}