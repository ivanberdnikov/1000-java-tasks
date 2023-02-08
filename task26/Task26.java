package task26;

import java.util.Arrays;
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] price = new int[3];
        int[] container = new int[3];
        int sum = 0;
        for (int i = 0; i < price.length; i++)
            price[i] = Integer.parseInt(str[i]);
        for (int i = 0; i < container.length; i++)
            container[i] = Integer.parseInt(str[i + 3]);
        Arrays.sort(price);
        Arrays.sort(container);
        for (int i = 0; i < 3; i++) {
            sum += price[i] * container[i];
        }
        System.out.println(sum);
    }
}