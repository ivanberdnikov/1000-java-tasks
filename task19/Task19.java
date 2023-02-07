package task19;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 0};
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++)
            arr[scanner.nextInt()]++;
        System.out.println(Integer.min(arr[0], arr[1]));
    }
}