package task31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        char[] allButtons = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
        char in = new Scanner(System.in).nextLine().charAt(0);
        if (in == 'm') System.out.println('q');
        else
            for (int i = 0; i < allButtons.length; i++)
                if (allButtons[i] == in) System.out.println(allButtons[i + 1]);
    }
}