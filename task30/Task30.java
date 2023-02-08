package task30;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        if (c % 10 == c / 1000 && c % 100 / 10 == c % 1000 / 100)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}