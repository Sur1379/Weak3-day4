package com.company.Weak3Day4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String s = scanner.next();
        String revS = "";
        int n = s.length() - 1;
        System.out.println(reverseString(s, revS, n));
    }

    public static String reverseString(String s, String revS, int n) {
        revS = revS + s.charAt(n);
        if (n == 0) {
            return revS;
        }
        return reverseString(s, revS, --n);
    }
}
