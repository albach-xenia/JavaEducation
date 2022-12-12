package lr5.Example5;

import lr5.Example4.Task4;

public class Main5 {

    public static void main(String[] args) {

        Task task = new Task(4);
        System.out.println("Число = " + task.PrintInt());

        task.Set(15);
        System.out.println("Число = " + task.PrintInt());

        task.Set(125);
        System.out.println("Число = " + task.PrintInt());

        task.Set(-15);
        System.out.println("Число = " + task.PrintInt());

        task.Set();
        System.out.println("Число = " + task.PrintInt());

    }
}
