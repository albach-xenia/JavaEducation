package lr11;

public class Example2 {
    public static void main(int x) {
        if ((2 * x + 1) < 20){
            main(2 * x + 1);
        }
        System.out.println("x= " + x);
    }

    public static void main(String[] args) {
        main(1);
    }
}
