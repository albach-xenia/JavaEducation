package lr9;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            // Создаем обьект исключения типа RuntimeException
            throw new RuntimeException("ошибка");
            // Данный блок не перехватывает ошибку
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
    }

}
