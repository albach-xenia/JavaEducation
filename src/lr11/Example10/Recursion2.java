package lr11.Example10;

public class Recursion2 {
    public static void main(int b) {
        System.out.println(" b = " + b);
        if ((3 * b + 2) < 10){
            main(3 * b + 2);
        }
    }

    public static void main(String[] args) {
        main(2
        );
    }
}
