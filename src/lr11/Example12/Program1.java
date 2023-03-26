package lr11.Example12;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){

        ArrayList arraylist = new ArrayList();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей:");
        int n = in.nextInt();
        long m = System.currentTimeMillis();
        for(int i = 1; i <= n;i++){
            arraylist.add(i);
        }
        kill(arraylist);
        for(int i = 0; i < arraylist.size();i++){
            System.out.println(arraylist.get(i) + "");
        }
        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }

    public static ArrayList kill(ArrayList arraylist){

        if(arraylist.size() < 2){
            return arraylist;
        }

        for(int i = 0;i < arraylist.size();i++){
            if(i+1 < arraylist.size()) {
                arraylist.remove(i + 1);
            }
        }
        return kill(arraylist);
    }
}//ArrayList следует использовать, когда в приоритете доступ по индексу, так как эти операции выполняются за константное время.
// Добавление в конец списка в среднем тоже выполняется за константное время.
// Кроме того в ArrayList нет дополнительных расходов на хранение связки между элементами.
// Минусы в скорости вставки/удаления элементов находящихся не в конце списка, так как при этой операции все элементы правее добавляемого/удаляемого сдвигаются.