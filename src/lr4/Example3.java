package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = in.nextInt(); // число строк которые необходимо вывести
        System.out.print("Введите высоту прямоугольника ");
        int height = in.nextInt(); // число строк которые необходимо вывести
        int[][] graph = new int [height][width]; // создание элемента массива необходимого размера
        int z = 0; // переменная для вывода количества строк
        for (int i = 0; i < height; i++) { // заполнения массива
            for (int j = 0; j < width; j++) {
                graph[i][j] = 2;
            }

        }
        for (int i = 0; i < height; i++) { // печать массива
            int count = i + 1; // переменная для повышения номера индекса для вывода на консоль
            System.out.print("Номер строки :" + count + " : ");
            for (int j = 0; j < width; j++) {
                System.out.print(graph[i][j] + "");
                z++;
            }
            System.out.println("Количество символов в строке: " + z);
            z = 0; // обнуление

        }
    }
}
