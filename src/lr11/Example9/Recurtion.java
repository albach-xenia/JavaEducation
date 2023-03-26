package lr11.Example9;
class Example9 {
    int values[];
    Example9(int i) {
        values = new int[i];
    }
    void PrintArray(int i) {
        {
            if (i == 0) return;
            else PrintArray(i - 1);
            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
        }
    }

    public class Recurtion {
        public static void main(String args[]) {
            Example9 obj = new Example9(10);
            int i;
            for (i = 0; i < 10; i++) {
                obj.values[i] = i;
            }
            obj.PrintArray(10);
        }
    }
}