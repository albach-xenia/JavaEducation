package lr6.Example5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите конечное число: ");
        int n = scanner.nextInt();
        System.out.print("Использовать рекурсию? (y/n): ");
        char choice = scanner.next().charAt(0);
        int result;
        if (choice == 'y') {
            result = sumSquaresRecursive(n);
        } else {
            result = sumSquaresIterative(n);
        }
        System.out.println("Сумма квадратов: " + result);
    }

    private static int sumSquaresIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static int sumSquaresRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumSquaresRecursive(n - 1);
    }
}
