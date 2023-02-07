package task20;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = n / 10;
        System.out.println(l * (l + 1) + "" + 25);
    }
}