package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число больше 1000");
        int number = in.nextInt();
        int result = (number / 1000 % 10);
        System.out.println("Четвертая цифра справа в десятичном предстовлении числа: " + result);
        in.close();
    }
}
