package com.company.Weak3Day4;

import java.util.Scanner;

public class AsteriskChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = 0;
        String s1 = "";
        System.out.println(addAsterisk(s, s1, i));
    }

    public static String addAsterisk(String s, String s1, int i) {
        if (i < s.length() - 1) {
            s1 = s1 + s.charAt(i) + '\u002A';
        } else {
            s1 = s1 + s.charAt(i);
        }
        if (i == s.length() - 1) {
            return s1;
        }
        return addAsterisk(s, s1, i + 1);
    }
}
