public class NaturalNumbersWithoutFor {
    public static void main(String args[]){
       numbers(1);
       }
       static void numbers(int i){
        if(i<=100){
            System.out.println(i);
            numbers(i+1);
        }
    }
    
}
