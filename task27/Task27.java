package task27;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]), c = Integer.parseInt(str[2]);
        int square = 2 * (a * b + b * c + a * c);
        int volume = a * b * c;
        System.out.println(square + " " + volume);
    }
}