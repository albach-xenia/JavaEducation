package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число не меньше 10:");
        int i = in.nextInt();
        if (i % 4==0 && i > 10) {
            System.out.printf("i = %d kratno 4, i>10\n", i); }
         else {
        System.out.printf("i = %d не удовлетворяет условия: i kratno 4, i>10\n", i);}


    }

}