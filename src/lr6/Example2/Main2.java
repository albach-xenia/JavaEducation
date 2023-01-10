package lr6.Example2;

 class  Counter {
    private static int count = 0;

    public static void increment() {
        count++;
        System.out.println("Значение статического поля: " + count);
    }
}
public class Main2 {
    public static void main(String[] args) {
       Counter.increment();//Значение поля +1
      Counter.increment();//значение поля +1
      Counter.increment();//значение поля +1
    }
}