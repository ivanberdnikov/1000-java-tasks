package task21;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer str = new StringTokenizer(line, " ");
        while (str.hasMoreTokens())
            arr.add(Integer.valueOf(str.nextToken()));
        if ((arr.get(2) * 2 <= arr.get(0)) && (arr.get(2) * 2 <= arr.get(1)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}