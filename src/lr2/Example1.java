package lr2;

import java.io.Console;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int d = in.nextInt();
        if (d % 3 == 0) {
            System.out.println("Делится:");
        } else
            System.out.println(" Не делится:");
        in.close();







    }
}

