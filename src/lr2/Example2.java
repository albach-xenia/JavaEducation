package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");
         int x = in.nextInt();
         if (x % 5 == 2 || x % 7 == 1) {
             System.out.println ("Число удовлетворяет условиям:");
        } else
            System.out.println("Число не удовлетворяет: ");
         in.close();






        }
    }

