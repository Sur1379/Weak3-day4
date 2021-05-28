package com.company.Weak3Day4;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int num = scanner.nextInt();
        System.out.println("Input required digit");
        int n = scanner.nextInt();
        int count = 0;
        System.out.println(returnCount(num, n, count));
    }
    public static int returnCount(int num, int n, int count){
        if(num == 0){
           return count;
        }
        if (n == num % 10){
            count++;
        }
        return returnCount(num / 10, n, count);
    }
}
