package task29;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int c = Integer.parseInt(str[0]) / 2, h = Integer.parseInt(str[1]) / 6, o = Integer.parseInt(str[2]);
        int min = 0;
        if (c > 0 && h > 0 && o > 0) {
            min = (c < h && c < o) ? c : ((h < o) ? h : o);
        }
        System.out.println(min);
    }
}