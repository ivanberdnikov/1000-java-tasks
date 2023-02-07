package task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] strNum = num.split(" ");
        int a = Integer.parseInt(strNum[0]);
        int b = Integer.parseInt(strNum[1]);
        int c = Integer.parseInt(strNum[2]);
        if (a * b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}