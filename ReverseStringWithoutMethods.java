public class ReverseStringWithoutMethods {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("java");
        String k = "";
        for(int i=s.length()-1;i>=0;i--){
            k +=s.charAt(i);
        }
        System.out.print(k);

    }
    
}
