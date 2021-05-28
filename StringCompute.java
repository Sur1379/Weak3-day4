package com.company.Weak3Day4;

import java.util.Locale;
import java.util.Scanner;

public class StringCompute {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String s = scanner.next();
        System.out.println("Input required symbol");
        String s1 = scanner.next();
        s = s.toLowerCase(Locale.ROOT);
        int i = s.length() - 1;
        s1 = s1.toLowerCase(Locale.ROOT);
        char ch = s1.charAt(0);
        System.out.println(returnCount(s, ch, count, i));
    }

    public static int returnCount(String s, char ch, int count, int i) {
        if (s.charAt(i) == ch) {
            count++;
        }
        if (i == 0) {
            return count;
        }
        return returnCount(s, ch, count, i - 1);
    }
}
