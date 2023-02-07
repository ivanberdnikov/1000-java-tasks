package task24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task24 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        String[] s = input.readLine().split(" ");
        int[] q = new int[s.length];
        for (int i = 0; i < s.length; i++) q[i] = Integer.parseInt(s[i]);
        String answer = (q[0] > (q[1] + q[2])) ? "YES" : "NO";
        System.out.println(answer);
    }
}