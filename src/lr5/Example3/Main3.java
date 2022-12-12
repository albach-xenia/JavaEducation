package lr5.Example3;

import lr5.Example1.Task1;
import lr5.Example2.Task2;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите num1");
        int int1 = in.nextInt();

        System.out.println("Введите num2");
        int int2 = in.nextInt();

        Task3 task1 = new Task3();
        Task3 task2 = new Task3(int1);
        Task3 task3 = new Task3(int1,int2);

    }

}
