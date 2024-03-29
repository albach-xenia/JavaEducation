package lr8.Example4;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }

    private static void start() throws Exception {
        var f1 = new File("C:\\tmp\\numIsh.txt");
        f1.createNewFile();
        var scan = new Scanner(in, "UTF-8");
        out.print("Сколько вещ. чисел записать в файл?: ");
        int count = scan.nextInt();
        float[] arr = new float[count];
        out.print("Введите числа: ");
        for (int i = 0; i < count; i++)
            arr[i] = scan.nextFloat();
        Program.writeFloatsToFile(f1.getAbsolutePath(), arr);

        var f2 = new File("C:\\tmp\\numRez.txt");
        f2.createNewFile();
        Program.copyFile(f1.getAbsolutePath(), f2.getAbsolutePath());
    }
}

