package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int value;
        System.out.println("Введите число");
        value = in.nextInt();
        int value2 = value + 1;
        int value3 = value^2 * value2^2 ;
        System.out.println(value - 1 + " " + value + " " + value2 + " " + value3*2);
        in.close();
    }
}