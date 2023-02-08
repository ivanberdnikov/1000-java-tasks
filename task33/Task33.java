package task33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task33 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(inp);
        String[] a = buf.readLine().split(" ");
        int l = Integer.parseInt(a[0]);
        int w = Integer.parseInt(a[1]);
        int h = Integer.parseInt(a[2]);
        int sum = (l * h * 2) + (w * h * 2);
        int answer = (sum / 16 > 0) ? sum / 16 : 1;
        System.out.println(answer);
    }
}