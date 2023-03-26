package lr11.Example12;
import java.util.LinkedList;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество людей: ");
        int n = in.nextInt();
        long m = System.currentTimeMillis();
        for(int i = 1; i <= n;i++){
            linkedlist.add(i);
    }
        kill(linkedlist);
        for(int i = 0; i < linkedlist.size();i++){
            System.out.println(linkedlist.get(i) + "");
        }
        System.out.println((double) (System.currentTimeMillis() - m)/1000);
    }

    public static LinkedList kill(LinkedList linkedlist){

        if (linkedlist.size() < 2){
            return linkedlist;
        }

        for (int i = 0;i < linkedlist.size();i++){
            if (i+1 < linkedlist.size()) {
                linkedlist.remove(i + 1);
            }
        }
        return kill(linkedlist);
    }
}
//LinkedList удобен когда важнее быстродействие операций вставки/удаления, которые в LinkedList выполняются за константное время.
// Операции доступа по индексу производятся перебором с начала или конца (смотря что ближе) до нужного элемента.
// Дополнительные затраты на хранение связки между элементами.