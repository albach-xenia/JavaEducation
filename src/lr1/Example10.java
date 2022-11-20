package lr1;

import java.io.Console;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Example10 {
   public static void main (String[] args) {
       Scanner in = new Scanner(System.in);
           int yearUser,year,age;
           System.out.println("Напишите свой год рождения");
           yearUser = in.nextInt();

       System.out.println("Какой сейчас год?");
           year = in.nextInt();

           age = year - yearUser;
       System.out.println("Вам " + age + " лет.");
           in.close();

       }
   }










