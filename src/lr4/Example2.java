package lr4;

public class Example2 {
    public static void main(String[] args) {
        int height = 17; // число столбцов которое необходимо вывести
        int i = 0; // переменная необходимая для вывода служебного сообщения о количестве
        for (int z = 1; z  <= height; z++){
            System.out.print("Номер строки: " + z + "");
            for (int j = 0; j <=i; j++){
                System.out.print("+");
            }
            i = i + 1;
            System.out.println("Количество символов в строке " +i);
        }
    }

}
