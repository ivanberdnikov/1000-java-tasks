package task35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task35 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(inp);
        String[] a = buf.readLine().split(" ");
        int x1 = Integer.parseInt(a[0]);
        int y1 = Integer.parseInt(a[1]);
        int x2 = Integer.parseInt(a[2]);
        int y2 = Integer.parseInt(a[3]);
        double answer = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        String result = String.format("%.5f", answer);
        System.out.println(result);
    }
}