package lr5.Example6;

public class Task {

    private static int min;
    private static int max;


    static void SetInt(int num1, int num2){
        System.out.println("Метод SetInt() c двумя аргументами");
        min = Math.min(Math.min(num1, min),num2);
        max = Math.max(Math.max(num1, max),num2);
    }

    static void SetInt(int num){
        System.out.println("Метод SetInt() c одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    static void PrintInt(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    Task(int num1, int num2){
        System.out.println("Конструктор Task_6() c двумя аргументами");
        min = Math.min(num1,num2);
        max = Math.max(num1,num2);
    }

    Task(int num){
        System.out.println("Конструктор Task_6() c одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
}
