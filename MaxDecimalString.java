package com.company.Weak3Day4;

import java.util.Scanner;

public class MaxDecimalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int i = s.length() - 1;
        int max = 0;
        System.out.println(findMaxValue(s, max, i));
    }

    public static int findMaxValue(String s, int max, int i) {
        if (max < Integer.parseInt(s.charAt(i) + "")) {
            max = Integer.parseInt(s.charAt(i) + "");
        }
        if (i == 0) {
            return max;
        }
        return findMaxValue(s, max, i - 1);
    }
}
