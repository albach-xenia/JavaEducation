package lr11;

public class Example1 {
    public static void main(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20){
            main(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        main(1);
    }
}
