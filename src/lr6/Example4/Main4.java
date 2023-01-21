package lr6.Example4;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Двойной факториал числа");
        System.out.println(Factorial1(9));
    }

    static int Factorial2(int n) {
        int result = 1;
        for (int i = n % 2 == 0 ? 2 : 1; i <= n; i += 2) {
            result *= i;
        }
            return result;
        }

         // c рекурсией
        static int Factorial1( int n)
        {
            if (n <= 1) {
                return 1;
            } else if (n ==0){
                return 0;
            }
            else {
                if ( n % 2 == 0){
                    if (n == 2){
                        return n;
                    }
                    return n * Factorial1(n - 2);
                }
                else {
                    if (n == 1){
                        return n;
                    }
                    return n * Factorial1(n - 2);
                }
            }
        }
    }



