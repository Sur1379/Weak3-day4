package com.company.Weak3Day4;

import java.util.Scanner;

public class StringClean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String s = scanner.next();
        int i = 0;
        String s1 = "";
        System.out.println(cleanString(s, s1, i));
    }
    public static String cleanString(String s, String s1, int i) {
        if(i == s.length() - 1){
            return s1;
        }
        if (i == 0) {
            s1 += s.charAt(i);
        } else {
            int j = 0;
            while (s.charAt(i) != s.charAt(j)) {
                if (j == i - 1) {
                    s1 += s.charAt(i);
                }
                j++;
            }
        }
        return cleanString(s, s1, ++i);
    }
}
