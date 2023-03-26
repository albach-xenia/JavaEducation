package lr11;

import java.util.Scanner;

public class Example8 {
    public static void main(int x) {
        int m;
        String temp = " ";
        while (x != 0){
            m = x % 2;
            temp = m + temp;
            x = x / 2;
        } if (temp.equals("10")){
            temp = "0" + temp;
            System.out.println(temp);
        } if (temp.equals("11")){
            temp = "0" + temp;
            System.out.println(temp);
        } if (temp.equals("1")){
            temp = "00" + temp;
            System.out.println(temp);
        } else {
            System.out.println(temp);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число которое хотите перевести в двоичную систему: ");
        int first = scanner.nextInt();
        main(first);
        scanner.close();
    }
}
