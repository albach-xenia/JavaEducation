package lr11.Example10;

public class Recursion1 {
    public static void main(int y) {
        System.out.println(" y = " + y);
        if ((4 * y + 3) < 30){
            main(4 * y + 3);
        }
    }

    public static void main(String[] args) {
        main(3);

    }
}
