package Timus.semestertwo.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";

        int count = scanner.nextInt();
        int mcount = count;
        int sum = 0;

        while (mcount > 0) {
            int mark = scanner.nextInt();
            if (mark == 3) {
                result = "None";
            }
            sum += mark;
            mcount--;
        }
        scanner.close();

        if (result.equals("") == true) {
            double avg = (double) sum / (double) count;
            if (avg == 5.0)
                result = "Named";
            else if (avg >= 4.5)
                result = "High";
            else
                result = "Common";
        }

        System.out.println(result);
    }
}
