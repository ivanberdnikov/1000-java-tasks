package task14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<Integer> berry = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            berry.add(Integer.valueOf(st.nextToken()));
        }
        int sumBerry = berry.get(0) + berry.get(1) - berry.get(2);
        String answer = (sumBerry > 0) ? String.valueOf(sumBerry) : "IMPOSSIBLE";
        System.out.println(answer);
    }
}