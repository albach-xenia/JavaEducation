package lr8.Example11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main{
    public static void main(String[] args) {
        try {
            start();
        } catch (Exception e) {
            out.printf("Error - %e", e);
        }
    }
    private static void start() throws Exception {
        var scan = new Scanner(in);
        var lines = new String[2];
        var doubles = new Double[5];
        for (int i = 0; i < lines.length; i++) {
            out.print("Введите строку: ");
            lines[i] = scan.nextLine();
        }
        for (int i = 0; i < doubles.length; i++) {
            out.print("Введите вещ. число: ");
            doubles[i] = scan.nextDouble();
        }
        Program.writeArrayToFile("C:\\tmp\\f1.txt", false, lines);
        Program.writeArrayToFile("C:\\tmp\\f1.txt", true, doubles);

        var fileInfo = Program.readFileToArray("C:\\tmp\\f1.txt");
        Program.writeParamsToFile("C:\\tmp\\f2.txt", false, fileInfo.get(1));
        var subFileInfo = fileInfo.subList(2, fileInfo.size());
        for (String line: subFileInfo) {
            try {
                var number = Double.valueOf(line);
                if (number % 2 == 0)
                    Program.writeParamsToFile("C:\\tmp\\f2.txt", true, number);
            } catch (NumberFormatException e) {
              continue;
            }
        }
    }
}

