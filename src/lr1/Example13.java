package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int one, two, sum;
        System.out.println("Введите первое число");
        one = in.nextInt();
        System.out.println("Введите второе число");
        two = in.nextInt();
        sum = one + two;
        System.out.println("Сумма двух чисел = " + sum);
        in.close();


    }
}
