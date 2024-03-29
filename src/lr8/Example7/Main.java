package lr8.Example7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\tmp\\f1.txt"), 1024);
            writer = new BufferedWriter(new FileWriter("C:\\tmp\\f2.txt"));
            int lineCount = 0;
            String line = "";
            while ((line = reader.readLine()) != null) {
                lineCount++;
                out.printf("$d: $s\n", lineCount, line);
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        } finally {
            reader.close();
            writer.close();
        }
    }
}

