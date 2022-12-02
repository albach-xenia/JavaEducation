package lr3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int p = Integer.parseInt(in.nextLine());

        int k = 10;
        int minimal = k;

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(k) + 1;
            if (arr[i] < minimal){
                minimal = arr[i];
            }
            System.out.print(arr[i] + "\t");
        }

        for (int j = 0; j < arr.length; j++){
            if (arr[j] < minimal){
                minimal = arr[j];
            }
        }
        System.out.println();

        System.out.println("Минимальный элемент этого массива равен:" + minimal);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimal){
                list.add(i);
            }
        }

        if(list.size() == 1){
            for (int k1 = 0; k1 < list.size(); k1++){
                System.out.print("Позиция: " + list.get(k1));
            }
        } else {
            System.out.print("Позиции:");
            for (int k1 = 0; k1 < list.size(); k1++){
                System.out.print(list.get(k1) + " || ");
            }
        }
    }
}
