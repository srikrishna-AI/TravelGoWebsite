import java.util.Scanner;

public class CountsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String:");

        String input = sc.nextLine();
        StringBuffer s = new StringBuffer(input);
        char k=' ';
        int vowel = 0;
        int cons = 0;
        
        for(int i=0;i<s.length();i++){
            k = s.charAt(i);

            if(k=='A' || k=='E' || k=='I' || k=='O'||k=='U'||k=='a' || k=='e' || k=='i' || k=='o'||k=='u'){
                vowel++;

            }
            else{
                cons++;

            }
        }
        System.out.print("the vowels are :"+vowel);
        System.out.println();
        System.out.print("the constonant are:"+cons);
    }
    
}
