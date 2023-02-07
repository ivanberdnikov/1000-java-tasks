package task18;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 2) {
            n /= 2;
        }
        String answer = (n == 2) ? "YES" : "NO";
        System.out.println(answer);
    }
}