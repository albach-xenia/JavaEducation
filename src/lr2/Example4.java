package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число от 5 до 10:");
        int i = in.nextInt();

        if (i >= 5 && i <= 10) {
            System.out.println(" Вы правильно ввели число:");
        }
        else{
            System.out.println("Не правильно ввели число: ");


        }
    }
    }

