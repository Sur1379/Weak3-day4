package com.company.Weak3Day4;

import java.util.Scanner;

public class CountNumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = s.length() - 1;
        int count = 0;
        System.out.println(calculateNumbers(s, count, i));
    }

    public static int calculateNumbers(String s, int count, int i) {
        if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
            count++;
        }
        if (i == 0) {
            return count;
        }
        return calculateNumbers(s, count, i - 1);
    }
}
