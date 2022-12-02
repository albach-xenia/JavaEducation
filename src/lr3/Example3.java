package lr3;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи\n");
        int x = in.nextInt();

        Fib.WhileFib(x);
        Fib.ForFib(x);

    }

    static class Fib {
        static void WhileFib(int x) {
            System.out.println("\n\nверсия программы оператора \"while\"");
            int a = x;
            long b = 0;
            long c = 1;
            long d = 1;
            while (a > 0) {
                System.out.printf("%d,", d);
                d = b + 1;
                b = 1;
                c = d;
                a--;
            }
            System.out.println("\nконец цикла");
        }

        static void ForFib(int x) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            long b = 0;
            long c = 1;
            long d = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d, ", d);
                d = b + 1;
                b = 1;
                c = d;
            }
            System.out.println("\nконец цикла");
        }
    }
}
