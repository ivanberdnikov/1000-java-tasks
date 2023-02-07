package task13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        ArrayList<String> line = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();
        int a = 0, b = 0;
        for (int i = 0; i < 4; i++) {
            str = scanner.nextLine();
            line.add(str);
        }
        for (String i : line) {
            StringTokenizer st = new StringTokenizer(i, " ");
            while (st.hasMoreTokens()) {
                score.add(Integer.valueOf(st.nextToken()));
            }
        }
        for (int i = 0; i < score.size(); i += 2) {
            if (score.get(i) > score.get(i + 1)) {
                a += 1;
            } else if (score.get(i) < score.get(i + 1)) {
                b += 1;
            }
        }
        if (a > b) {
            System.out.println("1");
        } else if (b > a) {
            System.out.println("2");
        } else {
            System.out.println("DRAW");
        }
    }
}