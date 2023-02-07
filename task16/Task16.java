package task16;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int boyCount = n / 6;
        int girlCount = n - boyCount * 2;
        System.out.println(boyCount + " " + girlCount + " " + boyCount);
    }
}