package Timus.task_1639;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner in = new Scanner(System.in, "ISO-8859-1");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "ISO-8859-1"));
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        int t = (a*b)%2;
        String res;
        if (t==0){
            res = "[:=[first]";
        }
        else{
            res = "[second]=:]";
        }

        System.out.println(res);
        out.flush();
    }
}

