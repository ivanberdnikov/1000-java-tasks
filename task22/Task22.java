package task22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task22 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        int in = Integer.parseInt(input.readLine());
        String[] s = input.readLine().split(" ");
        for (int i = s.length - 1; i >= 0; i--) System.out.print(s[i] + " ");
    }
}