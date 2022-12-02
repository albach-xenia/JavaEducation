package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        if (in.hasNextInt()) {
            int Size = in.nextInt();
            if (Size > 0) {
                System.out.println("Размер массива равен " + Size);
                int[] nums = new int[Size];
                int x = 0;
                int i = 0;
                while (x < Size) {
                    i++;
                    if (i % 5 == 2) {
                        nums[x] = i;
                        System.out.println("Элемент массива [" + x + "] = " + nums[x]);
                        x++;
                    }
                }
                System.out.println("Конец массива");
            } else {
                System.out.println("Некорректное значение");

            }
        }
    }
}

