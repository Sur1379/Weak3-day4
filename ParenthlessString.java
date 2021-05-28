package com.company.Weak3Day4;

import java.util.Scanner;

public class ParenthlessString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = 0;
        String s1 = "";
        System.out.println(addParenthless(s, s1, i));
    }

    public static String addParenthless(String s, String s1, int i) {
        if (i < (s.length() - 1) / 2) {
            s1 = s1 + s.charAt(i) + '(';
        } else if (i > s.length() / 2) {
            s1 = s1 + ')' + s.charAt(i);
        } else {
            s1 = s1 + s.charAt(i);
        }
        if (i == s.length() - 1) {
            return s1;
        }
        return addParenthless(s, s1, i + 1);
    }
}

