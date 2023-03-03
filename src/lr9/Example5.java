package lr9;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0"); // Создаем обьект исключения типа RuntimeException
            throw new RuntimeException("ошибка");
            // Ошибка не перехватывается,т.к. catch неподходящего типа для перехвата
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
    }
}
