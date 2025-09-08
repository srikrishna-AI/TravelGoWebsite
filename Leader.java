public class Leader {
    public static void main(String[] args) {
        int a[] = {1,2,4,3,6,8};
        int count =0;
        for(int i=1;i<a.length ;i++){
            if(a[i-1]< a[i]){
                count++;

            } 
        }
        System.out.println(count);
    }
    
}
