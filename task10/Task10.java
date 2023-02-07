package task10;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strNum = line.split(" ");
        int[] intNum = new int [strNum.length];
        for (int i = 0; i < strNum.length; i++) {
            intNum[i] = Integer.parseInt(strNum[i]);
        }
        Arrays.sort(intNum);
        System.out.println(Math.abs(intNum[0] - intNum[intNum.length-1]));
    }
}