package lr13;

public class Example4 {
    public static void main(String[] args) {
            Runnable task = () -> {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " count = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread thread1 = new Thread(task);
            thread1.start();

    }
}
