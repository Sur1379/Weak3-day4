package com.company.Weak3Day4;

public class CuttingString {
    public static void main(String[] args) {
        String s = "asdsfa";
        String s1 = "";
        int i = s.length() - 1;
        int n = 0;
        System.out.print(cuttingString(s, s1, i, n));
    }

    public static String cuttingString(String s, String sCut, int i, int n) {
        if (i >= 0) {
            if (s.charAt(n) != s.charAt(i) || n == i) {
                sCut = sCut + s.charAt(n);
            }
        }
        if (i == 0) {
            return sCut;
        }
        return cuttingString(s, sCut, i - 1, n + 1);
    }
}
