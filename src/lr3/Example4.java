package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите первое целое число:");
        int x = in.nextInt();

        System.out.printf("Ввведите второе целое число:");
        int y = in.nextInt();

        SortNums.WhileSortNums(x, y);
        SortNums.ForSortNums(x, y);
    }

    static class SortNums {
        static void WhileSortNums(int x, int y) {
            System.out.println("\n\nверсия программы на основе оператора \"while\"");
            if (x > y) {
                while (y <= x) {
                    System.out.printf("%d,", y);
                    y++;
                }
            }
            else {
                while (x <= y) {
                    System.out.printf("%d, ", x);
                    x++;
                }
            }
            System.out.println("Числовой ряд закончился");
        }

        public static void ForSortNums(int x, int y) {
            System.out.println("\n\nверсия программы на основе оператора \"for\"");
            if (x > y) {
                for (int y1 = y; y1 <= x; y1++) {
                    System.out.printf("%d, ", y1);
                }
            } else { // если y > x
                for (int x1 = x; x1 <= y; x1++) {
                    System.out.printf("%d, ", "x1");
                }
            }
            System.out.println("Числовой ряд закончился");
        }
    }
}

