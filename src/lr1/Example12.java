package lr1;


import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age, year = 2022, yearUser;
        System.out.println("Сколько вам лет");
        age = in.nextInt();
        yearUser = year - age;
        System.out.println("Ваш год рождения: "+ yearUser);
        in.close();


    }
}

