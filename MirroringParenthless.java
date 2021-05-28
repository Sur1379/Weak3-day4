package com.company.Weak3Day4;

import java.util.Scanner;

public class MirroringParenthless {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String sMir = "";
        int count = 0;
        int i = 0;
        System.out.println(reverseString(s, sMir, count, i));
    }

    public static String reverseString(String s, String sMir, int count, int i) {
        if (sMir.length() < s.length() + count) {
            if (i == 0 || (i) % 3 == 0 && i < s.length()) {
                count++;
                sMir = sMir + '(' + s.charAt(i);
            } else  {
                sMir = sMir + s.charAt(i);
            }
        }
        if(sMir.length() >= s.length() + count){
            if (i == s.length() - 1 && s.length() % 3 == 1 || i % 3 == 0) {
                sMir = sMir + s.charAt(i) + ')';
                if (i > 1) {
                    i = i - 2;
                }
            }
            else {
                sMir = sMir + s.charAt(i);
                if (i > 1) {
                    i = i - 2;
                }
                else if(i == 1){
                    i = i - 1;
                }
            }
             if (i == 0 && sMir.length() == (s.length() + count) * 2 - 2) {
                 sMir = sMir + s.charAt(i) + ')';
                return sMir;
            }
        }
        return reverseString(s, sMir, count, i + 1);
    }
}
