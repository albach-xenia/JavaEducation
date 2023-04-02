package lr12;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(metod(n));
    }
 public static String metod(int n)
    {
        String res = "";
        for (int i = 1; i <= n; i++)
        {
            if(0 == (n % i))
                res += i+ ",";
        }
        return res;
    }
}