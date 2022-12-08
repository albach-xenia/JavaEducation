package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();
        int firstArray [] [] = new int [a] [b];  // создание первого массива
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                firstArray[i][j] = random.nextInt(200);
                System.out.println(" i = "+ i +"; j = "+ j + "; value = " + firstArray[i] [j] );
            }
        }
        System.out.println("====");

        int deleteS = random.nextInt(a - 1); //генерация № строки для удаления
        int deleteK = random.nextInt(b - 1); //генерация № столбца для удаления

        System.out.println("deleteS = "+ (deleteS) + "; deleteK = "+ (deleteK));
        System.out.println("====");

        int secondArray[][] = new int[a-1][b-1]; // создание массива в котором удалена 1 строка и 1 столбец
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
