package lr5.Example6;

public class Main6 {

    public static void main(String[] args) {
        Task task = new Task(2, 4);
        task.PrintInt();

        Task task1 = new Task(1);
        task.PrintInt();

        task.SetInt(3, 17);
        task.PrintInt();

        task.SetInt(-7);
        task.PrintInt();
    }


}
