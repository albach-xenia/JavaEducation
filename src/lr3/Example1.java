package lr3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число номер дня недели от 1 до 7");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println(day + "День недели - понедельник");
                break;

            case 2:
                System.out.println(day + "День недели - вторник");
                break;

            case 3:
                System.out.println(day + "День недели - среда");
                break;

            case 4:
                System.out.println(day + "День недели - четверг");
                break;

            case 5:
                System.out.println(day + "День недели - пятница");
                break;

            case 6:
                System.out.println(day + "День недели - суббота");
                break;

            case 7:
                System.out.println(day + "День недели - воскресенье");
                break;

            default:
                System.out.println(day + "Такого дня недели не существует");
                break;

        }
    }




}
