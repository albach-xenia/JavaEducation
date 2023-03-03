package lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        try {
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            System.out.println(" Какого размера нужен массив? ");
            int l = scanner1.nextInt();
            byte newArray[] = new byte[l];
            System.out.println(" Введите значения ячеек по одной: ");
            for (byte i = 0; i < 1; i++){
                newArray[i] = scanner2.nextByte();
                System.out.print(" [ " + i + "] " + newArray[i] + " ");
            }
            System.out.println();
            System.out.println(" Все значения введены ");
            System.out.println(" Сумма элементов массива равна: ");
            byte sum = 0;
            for (byte i = 0; i < l ; i++){
                sum = (byte) (sum + newArray[i]);
            }
            System.out.println(sum);
        }catch (InputMismatchException a) {
            System.out.println(" ОШИБКА!  Несоответствующий тип вводных данных или выход за границы диапазона целочисленного типа byte !");
        }
    }
}
