package lr11;

public class Example7 {
    public static void main(String[] args) {
        System.out.println(fact(32));
    }

   public static int fact(int n){
        if ( n == 1 || n == 0) return n;
        return fact(n - 1) + fact(n - 2);

    }
}
