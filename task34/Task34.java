package task34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task34 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(inp);
        String[] a = buf.readLine().split(" ");
        int s = Integer.parseInt(a[0]);
        int t = Integer.parseInt(a[1]);
        int answer = (s < t) ? t - s : 12 - s + t;
        System.out.println(answer);
    }
}