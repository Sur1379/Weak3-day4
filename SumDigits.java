package com.company.Weak3Day4;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(returnSum(num));
    }
    public static int returnSum(int num){
        if(num == 0){
            return 0;
        }
        return num % 10 + returnSum(num/10);
    }
}
