package lr5.Example5;

public class Task {

    private int int1;

    public void Set(int n){
        System.out.println("Метод Set() c аргументом");
        int1 = n;

        if(n>= 100){
            int1 = 100;
        }

        if (n <= 0){
            int1 = 0;
        }

    }

    public  void  Set(){
        System.out.println("Метод Set() c аргументом");
        int1 = 0;
    }

    public int PrintInt(){
        return int1;
    }

    Task(int int1){
        System.out.println("Task() конструктор");
        this.Set(int1);
    }

}
