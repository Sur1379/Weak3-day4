package com.company.Weak3Day4;

import java.util.Scanner;

public class SortLowercaseX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = "";
        char ch = 'x';
        int i = 0;
        System.out.println(sortingChar(s, s1, ch, i));
    }

    public static String sortingChar(String s, String s1, char ch, int i) {
        if (s.charAt(i) != 'x') {
            s1 = s1 + s.charAt(i);
        }
        if(i != s.length() - 1){
            i++;
        }
        else {
            while ( i >= 0) {
                if(s.charAt(i) == 'x'){
                s1 = s1 + s.charAt(i);
                }
                i--;
            }
            return s1;
        }
        return sortingChar(s, s1, ch, i);
    }
}
