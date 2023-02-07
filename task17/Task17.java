package task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weight = scanner.nextLine();
        ArrayList<Integer> ar = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(weight, " ");
        boolean errors = false;
        while (st.hasMoreTokens()) {
            ar.add(Integer.valueOf(st.nextToken()));
        }
        for (Integer i : ar) {
            if (i < 94 || i > 727) {
                errors = true;
            }
        }
        System.out.println((errors) ? "Error" : (Collections.max(ar)));
    }
}