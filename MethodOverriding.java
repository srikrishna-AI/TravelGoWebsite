public class MethodOverriding extends Multiple {
    public static void main(String[] args) {
        MethodOverriding mc = new MethodOverriding();
        System.out.println(mc.multiply(5, 4)); 
    }
}

class Multiple extends Add {
    @Override
    public int multiply(int a, int b) {
        return a + b + 1; 
    }
}

class Add {
    public int multiply(int a, int b) {
        return a + b; 
    }
}