package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();
        int [] [] ArrayZmeyka = new int [a] [b];
        int hvost = 0;
        int telo = 0;
        int t = 0;
        for (int i = 0; t < ArrayZmeyka.length; t++){
            for (int j = 0; j < (ArrayZmeyka[i].length - hvost); j++){
                ArrayZmeyka [i][j] = telo;
                telo++;
            }
            if (i < ArrayZmeyka.length - 1){
                i++;}
            for (int o = a - 1; o > hvost; o--){
                ArrayZmeyka[o][ArrayZmeyka[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < ArrayZmeyka.length; i++){
            int count = i + 1;
            System.out.print("Номер строки : " + count+ " : ");
            for (int j = 0; j < ArrayZmeyka[i].length; j++){
                System.out.print(ArrayZmeyka[i][j]+ " ");
                z++;
            }
            System.out.println("Количество символов в строке " + z);
            z = 0;
        }

    }
}
