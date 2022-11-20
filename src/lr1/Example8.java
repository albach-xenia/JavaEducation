package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Какое сегодня число? ");
        String day = in.nextLine();

        System.out.println("Какой сегодня день недели?");
        String week = in.nextLine();

        System.out.println("Какой сегодня месяц?");
        String month = in.nextLine();

        System.out.println("Какой сегодня день недели?" + week);
        System.out.println("Какое сегодня число?" + day);
        System.out.println("Какой сегодня месяц?" + month);
        in.close();
    }
}
