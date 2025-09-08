public class InheritanceExample extends InheritanceExampleTwo  {
    public int add(int a,int b,int c){
        return a*b*c;


    }
    public static void main(String[] args) {
        InheritanceExample sc = new InheritanceExample();
        System.out.println(sc.add(1,2,3,4));
    }
    
}

class InheritanceExampleTwo extends Mutiple{

    public int add(int a,int b){

        return a*b;

    }

    
}

class Mutiple{
    public int add(int a,int b,int c,int d){
        return a*b*c*d;
    }
}


