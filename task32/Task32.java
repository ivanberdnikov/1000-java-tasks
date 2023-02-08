package task32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task32 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(inp);
        int k = Integer.parseInt(buf.readLine());
        for (int i = 0; i < k; i++) {
            String[] a = buf.readLine().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            int sum = 19 * m + (n + 239) * (n + 366) / 2;
            System.out.println(sum);
        }
    }
}