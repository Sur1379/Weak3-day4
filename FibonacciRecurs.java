package com.company.Weak3Day4;

import java.util.Scanner;

public class FibonacciRecurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index for Fibonacci");
        int N = scanner.nextInt();
        while (N < 1){
            System.out.println("Incorrect index, it will be > 1, try again");
            N = scanner.nextInt();
        }
                System.out.println(findElement(N));
    }
    public static int findElement(int N){

        if (N == 1){
            return 0;
        }
        else if (N == 0){
            return 1;
        }
        return findElement(N-1) + findElement(N - 2);
    }
}
