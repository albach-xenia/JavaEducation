package Timus.semestertwo.task_1585;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/Timus/semestertwo/task_1585/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        int size1 = Integer.parseInt(bufferedReader.readLine());
        String reedLine;
        int countMp = 0, countLp = 0, countEp = 0;
        while ((reedLine = bufferedReader.readLine()) != null) {
            if (reedLine.equals("Emperor Penguin")) {
                countEp++;
            } else if (reedLine.equals("Little Penguin")) {
                countLp++;
            } else if (reedLine.equals("Macaroni Penguin")) {
                countMp++;
            }
        }
        int[] penguinAr = new int[]{countEp, countLp, countMp};
        Arrays.sort(penguinAr);
        if (countLp == penguinAr[penguinAr.length - 1]) {
            System.out.println("Little Penguin");
        } else if (countMp == penguinAr[penguinAr.length - 1]) {
            System.out.println("Macaroni Penguin");
        } else if (countEp == penguinAr[penguinAr.length - 1]) {
            System.out.println("Emperor Penguin");
        }
    }
}