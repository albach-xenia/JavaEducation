package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int value, value1, razn, sum;
        System.out.println("Введите первое число");
        value = in.nextInt();
        System.out.println("Введите второе число");
        value1 = in.nextInt();
        razn = value - value1;
        sum = value + value1;
        System.out.println("Сумма чисел = " + sum + " Разность чисел = " + razn);
        in.close();
    }
}
